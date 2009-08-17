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
 * @provisional
 */
public interface SimpleRList<T> {
	
	
	int getLength();
	
	RCharacterStore getNames();
	
	String getName(int idx);
	
	T get(int idx);
	
	T get(String name);
	
}