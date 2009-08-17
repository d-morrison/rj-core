/*******************************************************************************
 * Copyright (c) 2008-2009 Stephan Wahlbrink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * v2.1 or newer, which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * 
 * Contributors:
 *     Stephan Wahlbrink - initial API and implementation
 *******************************************************************************/

package de.walware.rj.server;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


/**
 * Command item for main loop UI interaction.
 */
public final class ExtUICmdItem extends MainCmdItem implements Externalizable {
	
	public static final String C_CHOOSE_FILE = "chooseFile";
	public static final String C_OPENIN_EDITOR = "openinEditor";
	public static final String C_LOAD_HISTORY = "loadHistory";
	public static final String C_SAVE_HISTORY = "saveHistory";
	public static final String C_SHOW_HISTORY = "showHistory";
	public static final String C_ADDTO_HISTORY = "addtoHistory";
	
	public static final int O_NEW = 8;
	
	private static final int OV_WITHTEXT =          0x10000000;
	private static final int OM_TEXTANSWER =        (RjsStatus.OK << OS_STATUS) | OV_WITHTEXT;
	
	
	private String command;
	private String text;
	
	
	public ExtUICmdItem(final String command, final int options, final boolean waitForClient) {
		assert (command != null);
		this.command = command;
		this.options = (waitForClient) ?
				(options | OM_WAITFORCLIENT) : (options);
	}
	
	public ExtUICmdItem(final String command, final int options, final String text, final boolean waitForClient) {
		assert (command != null);
		this.command = command;
		this.options = (waitForClient) ?
				(options | OM_WAITFORCLIENT) : (options);
		if (text != null) {
			this.options |= OV_WITHTEXT;
			this.text = text;
		}
	}
	
	/**
	 * Constructor for automatic deserialization
	 */
	public ExtUICmdItem() {
	}
	
	/**
	 * Constructor for deserialization
	 */
	public ExtUICmdItem(final ObjectInput in) throws IOException, ClassNotFoundException {
		readExternal(in);
	}
	
	@Override
	public void writeExternal(final ObjectOutput out) throws IOException {
		out.writeUTF(this.command);
		out.writeInt(this.options);
		out.writeByte(this.requestId);
		if ((this.options & OV_WITHTEXT) != 0) {
			out.writeUTF(this.text);
		}
	}
	
	public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException {
		this.command = in.readUTF();
		this.options = in.readInt();
		this.requestId = in.readByte();
		if ((this.options & OV_WITHTEXT) != 0) {
			this.text = in.readUTF();
		}
	}
	
	
	@Override
	public byte getCmdType() {
		return T_EXTENDEDUI_ITEM;
	}
	
	
	@Override
	public void setAnswer(final int status) {
		this.options = (this.options & OM_CLEARFORANSWER) | (status << OS_STATUS);
		this.text = null;
	}
	
	@Override
	public void setAnswer(final String text) {
		this.options = (text != null) ? 
				((this.options & OM_CLEARFORANSWER) | OM_TEXTANSWER) : (this.options & OM_CLEARFORANSWER);
		this.text = text;
	}
	
	
	public String getCommand() {
		return this.command;
	}
	
	@Override
	public Object getData() {
		return this.text;
	}
	
	@Override
	public String getDataText() {
		return this.text;
	}
	
	
	@Override
	public boolean testEquals(final MainCmdItem other) {
		if (!(other instanceof ExtUICmdItem)) {
			return false;
		}
		final ExtUICmdItem otherItem = (ExtUICmdItem) other;
		if (!getCommand().equals(otherItem.getCommand())) {
			return false;
		}
		if (this.options != otherItem.options) {
			return false;
		}
		if (((this.options & OV_WITHTEXT) != 0)
				&& !getDataText().equals(otherItem.getDataText())) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer(100);
		sb.append("ExtUICmdItem (command=");
		sb.append(this.command);
		sb.append(", options=0x");
		sb.append(Integer.toHexString(this.options));
		sb.append(")");
		if ((this.options & OV_WITHTEXT) != 0) {
			sb.append("\n<TEXT>\n");
			sb.append(this.text);
			sb.append("\n</TEXT>");
		}
		else {
			sb.append("\n<TEXT />");
		}
		return sb.toString();
	}
	
}