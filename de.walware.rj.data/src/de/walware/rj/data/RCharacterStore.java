/*******************************************************************************
 * Copyright (c) 2009 Stephan Wahlbrink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * v2.1 or newer, which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * 
 * Contributors:
 *     Stephan Wahlbrink - initial API and implementation
 *******************************************************************************/

package de.walware.rj.data;


/**
 * Interface for R data stores of type {@link RStore#CHARACTER}.
 * <p>
 * An R data store implements this interface if the R function
 * <code>typeof(object)</code> returns 'character'.</p>
 */
public interface RCharacterStore extends RStore {
	
	
	int indexOf(String value);
	int indexOf(String value, int fromIdx);
	boolean contains(final String value);
	
	String get(int idx);
	String[] toArray();
	
}