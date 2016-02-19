/*=============================================================================#
 # Copyright (c) 2011-2016 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.rj.graphic.utils;


public final class Unicode2AdbSymbolMapping implements CharMapping {
	
	
	private final static char[] ADBSYMBOL_U2C = new char[0xffff];
	
	static {
		for (int i = 0; i < ADBSYMBOL_U2C.length; i++) {
			ADBSYMBOL_U2C[i] = (char) i;
		}
		// Generated by CodeGenAdbSymbol
		ADBSYMBOL_U2C[0x0020] = 0x20; // SPACE
		ADBSYMBOL_U2C[0x00A0] = 0x20; // NO-BREAK SPACE
		ADBSYMBOL_U2C[0x0021] = 0x21; // EXCLAMATION MARK
		ADBSYMBOL_U2C[0x2200] = 0x22; // FOR ALL
		ADBSYMBOL_U2C[0x0023] = 0x23; // NUMBER SIGN
		ADBSYMBOL_U2C[0x2203] = 0x24; // THERE EXISTS
		ADBSYMBOL_U2C[0x0025] = 0x25; // PERCENT SIGN
		ADBSYMBOL_U2C[0x0026] = 0x26; // AMPERSAND
		ADBSYMBOL_U2C[0x220B] = 0x27; // CONTAINS AS MEMBER
		ADBSYMBOL_U2C[0x0028] = 0x28; // LEFT PARENTHESIS
		ADBSYMBOL_U2C[0x0029] = 0x29; // RIGHT PARENTHESIS
		ADBSYMBOL_U2C[0x2217] = 0x2A; // ASTERISK OPERATOR
		ADBSYMBOL_U2C[0x002B] = 0x2B; // PLUS SIGN
		ADBSYMBOL_U2C[0x002C] = 0x2C; // COMMA
		ADBSYMBOL_U2C[0x2212] = 0x2D; // MINUS SIGN
		ADBSYMBOL_U2C[0x002E] = 0x2E; // FULL STOP
		ADBSYMBOL_U2C[0x002F] = 0x2F; // SOLIDUS
		ADBSYMBOL_U2C[0x0030] = 0x30; // DIGIT ZERO
		ADBSYMBOL_U2C[0x0031] = 0x31; // DIGIT ONE
		ADBSYMBOL_U2C[0x0032] = 0x32; // DIGIT TWO
		ADBSYMBOL_U2C[0x0033] = 0x33; // DIGIT THREE
		ADBSYMBOL_U2C[0x0034] = 0x34; // DIGIT FOUR
		ADBSYMBOL_U2C[0x0035] = 0x35; // DIGIT FIVE
		ADBSYMBOL_U2C[0x0036] = 0x36; // DIGIT SIX
		ADBSYMBOL_U2C[0x0037] = 0x37; // DIGIT SEVEN
		ADBSYMBOL_U2C[0x0038] = 0x38; // DIGIT EIGHT
		ADBSYMBOL_U2C[0x0039] = 0x39; // DIGIT NINE
		ADBSYMBOL_U2C[0x003A] = 0x3A; // COLON
		ADBSYMBOL_U2C[0x003B] = 0x3B; // SEMICOLON
		ADBSYMBOL_U2C[0x003C] = 0x3C; // LESS-THAN SIGN
		ADBSYMBOL_U2C[0x003D] = 0x3D; // EQUALS SIGN
		ADBSYMBOL_U2C[0x003E] = 0x3E; // GREATER-THAN SIGN
		ADBSYMBOL_U2C[0x003F] = 0x3F; // QUESTION MARK
		ADBSYMBOL_U2C[0x2245] = 0x40; // APPROXIMATELY EQUAL TO
		ADBSYMBOL_U2C[0x0391] = 0x41; // GREEK CAPITAL LETTER ALPHA
		ADBSYMBOL_U2C[0x0392] = 0x42; // GREEK CAPITAL LETTER BETA
		ADBSYMBOL_U2C[0x03A7] = 0x43; // GREEK CAPITAL LETTER CHI
		ADBSYMBOL_U2C[0x0394] = 0x44; // GREEK CAPITAL LETTER DELTA
		ADBSYMBOL_U2C[0x2206] = 0x44; // INCREMENT
		ADBSYMBOL_U2C[0x0395] = 0x45; // GREEK CAPITAL LETTER EPSILON
		ADBSYMBOL_U2C[0x03A6] = 0x46; // GREEK CAPITAL LETTER PHI
		ADBSYMBOL_U2C[0x0393] = 0x47; // GREEK CAPITAL LETTER GAMMA
		ADBSYMBOL_U2C[0x0397] = 0x48; // GREEK CAPITAL LETTER ETA
		ADBSYMBOL_U2C[0x0399] = 0x49; // GREEK CAPITAL LETTER IOTA
		ADBSYMBOL_U2C[0x03D1] = 0x4A; // GREEK THETA SYMBOL
		ADBSYMBOL_U2C[0x039A] = 0x4B; // GREEK CAPITAL LETTER KAPPA
		ADBSYMBOL_U2C[0x039B] = 0x4C; // GREEK CAPITAL LETTER LAMDA
		ADBSYMBOL_U2C[0x039C] = 0x4D; // GREEK CAPITAL LETTER MU
		ADBSYMBOL_U2C[0x039D] = 0x4E; // GREEK CAPITAL LETTER NU
		ADBSYMBOL_U2C[0x039F] = 0x4F; // GREEK CAPITAL LETTER OMICRON
		ADBSYMBOL_U2C[0x03A0] = 0x50; // GREEK CAPITAL LETTER PI
		ADBSYMBOL_U2C[0x0398] = 0x51; // GREEK CAPITAL LETTER THETA
		ADBSYMBOL_U2C[0x03A1] = 0x52; // GREEK CAPITAL LETTER RHO
		ADBSYMBOL_U2C[0x03A3] = 0x53; // GREEK CAPITAL LETTER SIGMA
		ADBSYMBOL_U2C[0x03A4] = 0x54; // GREEK CAPITAL LETTER TAU
		ADBSYMBOL_U2C[0x03A5] = 0x55; // GREEK CAPITAL LETTER UPSILON
		ADBSYMBOL_U2C[0x03C2] = 0x56; // GREEK SMALL LETTER FINAL SIGMA
		ADBSYMBOL_U2C[0x03A9] = 0x57; // GREEK CAPITAL LETTER OMEGA
		ADBSYMBOL_U2C[0x2126] = 0x57; // OHM SIGN
		ADBSYMBOL_U2C[0x039E] = 0x58; // GREEK CAPITAL LETTER XI
		ADBSYMBOL_U2C[0x03A8] = 0x59; // GREEK CAPITAL LETTER PSI
		ADBSYMBOL_U2C[0x0396] = 0x5A; // GREEK CAPITAL LETTER ZETA
		ADBSYMBOL_U2C[0x005B] = 0x5B; // LEFT SQUARE BRACKET
		ADBSYMBOL_U2C[0x2234] = 0x5C; // THEREFORE
		ADBSYMBOL_U2C[0x005D] = 0x5D; // RIGHT SQUARE BRACKET
		ADBSYMBOL_U2C[0x22A5] = 0x5E; // UP TACK
		ADBSYMBOL_U2C[0x005F] = 0x5F; // LOW LINE
		ADBSYMBOL_U2C[0xF8E5] = 0x60; // RADICAL EXTENDER
		ADBSYMBOL_U2C[0x03B1] = 0x61; // GREEK SMALL LETTER ALPHA
		ADBSYMBOL_U2C[0x03B2] = 0x62; // GREEK SMALL LETTER BETA
		ADBSYMBOL_U2C[0x03C7] = 0x63; // GREEK SMALL LETTER CHI
		ADBSYMBOL_U2C[0x03B4] = 0x64; // GREEK SMALL LETTER DELTA
		ADBSYMBOL_U2C[0x03B5] = 0x65; // GREEK SMALL LETTER EPSILON
		ADBSYMBOL_U2C[0x03C6] = 0x66; // GREEK SMALL LETTER PHI
		ADBSYMBOL_U2C[0x03B3] = 0x67; // GREEK SMALL LETTER GAMMA
		ADBSYMBOL_U2C[0x03B7] = 0x68; // GREEK SMALL LETTER ETA
		ADBSYMBOL_U2C[0x03B9] = 0x69; // GREEK SMALL LETTER IOTA
		ADBSYMBOL_U2C[0x03D5] = 0x6A; // GREEK PHI SYMBOL
		ADBSYMBOL_U2C[0x03BA] = 0x6B; // GREEK SMALL LETTER KAPPA
		ADBSYMBOL_U2C[0x03BB] = 0x6C; // GREEK SMALL LETTER LAMDA
		ADBSYMBOL_U2C[0x00B5] = 0x6D; // MICRO SIGN
		ADBSYMBOL_U2C[0x03BC] = 0x6D; // GREEK SMALL LETTER MU
		ADBSYMBOL_U2C[0x03BD] = 0x6E; // GREEK SMALL LETTER NU
		ADBSYMBOL_U2C[0x03BF] = 0x6F; // GREEK SMALL LETTER OMICRON
		ADBSYMBOL_U2C[0x03C0] = 0x70; // GREEK SMALL LETTER PI
		ADBSYMBOL_U2C[0x03B8] = 0x71; // GREEK SMALL LETTER THETA
		ADBSYMBOL_U2C[0x03C1] = 0x72; // GREEK SMALL LETTER RHO
		ADBSYMBOL_U2C[0x03C3] = 0x73; // GREEK SMALL LETTER SIGMA
		ADBSYMBOL_U2C[0x03C4] = 0x74; // GREEK SMALL LETTER TAU
		ADBSYMBOL_U2C[0x03C5] = 0x75; // GREEK SMALL LETTER UPSILON
		ADBSYMBOL_U2C[0x03D6] = 0x76; // GREEK PI SYMBOL
		ADBSYMBOL_U2C[0x03C9] = 0x77; // GREEK SMALL LETTER OMEGA
		ADBSYMBOL_U2C[0x03BE] = 0x78; // GREEK SMALL LETTER XI
		ADBSYMBOL_U2C[0x03C8] = 0x79; // GREEK SMALL LETTER PSI
		ADBSYMBOL_U2C[0x03B6] = 0x7A; // GREEK SMALL LETTER ZETA
		ADBSYMBOL_U2C[0x007B] = 0x7B; // LEFT CURLY BRACKET
		ADBSYMBOL_U2C[0x007C] = 0x7C; // VERTICAL LINE
		ADBSYMBOL_U2C[0x007D] = 0x7D; // RIGHT CURLY BRACKET
		ADBSYMBOL_U2C[0x223C] = 0x7E; // TILDE OPERATOR
		ADBSYMBOL_U2C[0x20AC] = 0xA0; // EURO SIGN
		ADBSYMBOL_U2C[0x03D2] = 0xA1; // GREEK UPSILON WITH HOOK SYMBOL
		ADBSYMBOL_U2C[0x2032] = 0xA2; // PRIME
		ADBSYMBOL_U2C[0x2264] = 0xA3; // LESS-THAN OR EQUAL TO
		ADBSYMBOL_U2C[0x2044] = 0xA4; // FRACTION SLASH
		ADBSYMBOL_U2C[0x2215] = 0xA4; // DIVISION SLASH
		ADBSYMBOL_U2C[0x221E] = 0xA5; // INFINITY
		ADBSYMBOL_U2C[0x0192] = 0xA6; // LATIN SMALL LETTER F WITH HOOK
		ADBSYMBOL_U2C[0x2663] = 0xA7; // BLACK CLUB SUIT
		ADBSYMBOL_U2C[0x2666] = 0xA8; // BLACK DIAMOND SUIT
		ADBSYMBOL_U2C[0x2665] = 0xA9; // BLACK HEART SUIT
		ADBSYMBOL_U2C[0x2660] = 0xAA; // BLACK SPADE SUIT
		ADBSYMBOL_U2C[0x2194] = 0xAB; // LEFT RIGHT ARROW
		ADBSYMBOL_U2C[0x2190] = 0xAC; // LEFTWARDS ARROW
		ADBSYMBOL_U2C[0x2191] = 0xAD; // UPWARDS ARROW
		ADBSYMBOL_U2C[0x2192] = 0xAE; // RIGHTWARDS ARROW
		ADBSYMBOL_U2C[0x2193] = 0xAF; // DOWNWARDS ARROW
		ADBSYMBOL_U2C[0x00B0] = 0xB0; // DEGREE SIGN
		ADBSYMBOL_U2C[0x00B1] = 0xB1; // PLUS-MINUS SIGN
		ADBSYMBOL_U2C[0x2033] = 0xB2; // DOUBLE PRIME
		ADBSYMBOL_U2C[0x2265] = 0xB3; // GREATER-THAN OR EQUAL TO
		ADBSYMBOL_U2C[0x00D7] = 0xB4; // MULTIPLICATION SIGN
		ADBSYMBOL_U2C[0x221D] = 0xB5; // PROPORTIONAL TO
		ADBSYMBOL_U2C[0x2202] = 0xB6; // PARTIAL DIFFERENTIAL
		ADBSYMBOL_U2C[0x2022] = 0xB7; // BULLET
		ADBSYMBOL_U2C[0x00F7] = 0xB8; // DIVISION SIGN
		ADBSYMBOL_U2C[0x2260] = 0xB9; // NOT EQUAL TO
		ADBSYMBOL_U2C[0x2261] = 0xBA; // IDENTICAL TO
		ADBSYMBOL_U2C[0x2248] = 0xBB; // ALMOST EQUAL TO
		ADBSYMBOL_U2C[0x2026] = 0xBC; // HORIZONTAL ELLIPSIS
		ADBSYMBOL_U2C[0xF8E6] = 0xBD; // VERTICAL ARROW EXTENDER
		ADBSYMBOL_U2C[0xF8E7] = 0xBE; // HORIZONTAL ARROW EXTENDER
		ADBSYMBOL_U2C[0x21B5] = 0xBF; // DOWNWARDS ARROW WITH CORNER LEFTWARDS
		ADBSYMBOL_U2C[0x2135] = 0xC0; // ALEF SYMBOL
		ADBSYMBOL_U2C[0x2111] = 0xC1; // BLACK-LETTER CAPITAL I
		ADBSYMBOL_U2C[0x211C] = 0xC2; // BLACK-LETTER CAPITAL R
		ADBSYMBOL_U2C[0x2118] = 0xC3; // SCRIPT CAPITAL P
		ADBSYMBOL_U2C[0x2297] = 0xC4; // CIRCLED TIMES
		ADBSYMBOL_U2C[0x2295] = 0xC5; // CIRCLED PLUS
		ADBSYMBOL_U2C[0x2205] = 0xC6; // EMPTY SET
		ADBSYMBOL_U2C[0x2229] = 0xC7; // INTERSECTION
		ADBSYMBOL_U2C[0x222A] = 0xC8; // UNION
		ADBSYMBOL_U2C[0x2283] = 0xC9; // SUPERSET OF
		ADBSYMBOL_U2C[0x2287] = 0xCA; // SUPERSET OF OR EQUAL TO
		ADBSYMBOL_U2C[0x2284] = 0xCB; // NOT A SUBSET OF
		ADBSYMBOL_U2C[0x2282] = 0xCC; // SUBSET OF
		ADBSYMBOL_U2C[0x2286] = 0xCD; // SUBSET OF OR EQUAL TO
		ADBSYMBOL_U2C[0x2208] = 0xCE; // ELEMENT OF
		ADBSYMBOL_U2C[0x2209] = 0xCF; // NOT AN ELEMENT OF
		ADBSYMBOL_U2C[0x2220] = 0xD0; // ANGLE
		ADBSYMBOL_U2C[0x2207] = 0xD1; // NABLA
		ADBSYMBOL_U2C[0xF6DA] = 0xD2; // REGISTERED SIGN SERIF
		ADBSYMBOL_U2C[0xF6D9] = 0xD3; // COPYRIGHT SIGN SERIF
		ADBSYMBOL_U2C[0xF6DB] = 0xD4; // TRADE MARK SIGN SERIF
		ADBSYMBOL_U2C[0x220F] = 0xD5; // N-ARY PRODUCT
		ADBSYMBOL_U2C[0x221A] = 0xD6; // SQUARE ROOT
		ADBSYMBOL_U2C[0x22C5] = 0xD7; // DOT OPERATOR
		ADBSYMBOL_U2C[0x00AC] = 0xD8; // NOT SIGN
		ADBSYMBOL_U2C[0x2227] = 0xD9; // LOGICAL AND
		ADBSYMBOL_U2C[0x2228] = 0xDA; // LOGICAL OR
		ADBSYMBOL_U2C[0x21D4] = 0xDB; // LEFT RIGHT DOUBLE ARROW
		ADBSYMBOL_U2C[0x21D0] = 0xDC; // LEFTWARDS DOUBLE ARROW
		ADBSYMBOL_U2C[0x21D1] = 0xDD; // UPWARDS DOUBLE ARROW
		ADBSYMBOL_U2C[0x21D2] = 0xDE; // RIGHTWARDS DOUBLE ARROW
		ADBSYMBOL_U2C[0x21D3] = 0xDF; // DOWNWARDS DOUBLE ARROW
		ADBSYMBOL_U2C[0x25CA] = 0xE0; // LOZENGE
		ADBSYMBOL_U2C[0x2329] = 0xE1; // LEFT-POINTING ANGLE BRACKET
		ADBSYMBOL_U2C[0xF8E8] = 0xE2; // REGISTERED SIGN SANS SERIF
		ADBSYMBOL_U2C[0xF8E9] = 0xE3; // COPYRIGHT SIGN SANS SERIF
		ADBSYMBOL_U2C[0xF8EA] = 0xE4; // TRADE MARK SIGN SANS SERIF
		ADBSYMBOL_U2C[0x2211] = 0xE5; // N-ARY SUMMATION
		ADBSYMBOL_U2C[0xF8EB] = 0xE6; // LEFT PAREN TOP
		ADBSYMBOL_U2C[0xF8EC] = 0xE7; // LEFT PAREN EXTENDER
		ADBSYMBOL_U2C[0xF8ED] = 0xE8; // LEFT PAREN BOTTOM
		ADBSYMBOL_U2C[0xF8EE] = 0xE9; // LEFT SQUARE BRACKET TOP
		ADBSYMBOL_U2C[0xF8EF] = 0xEA; // LEFT SQUARE BRACKET EXTENDER
		ADBSYMBOL_U2C[0xF8F0] = 0xEB; // LEFT SQUARE BRACKET BOTTOM
		ADBSYMBOL_U2C[0xF8F1] = 0xEC; // LEFT CURLY BRACKET TOP
		ADBSYMBOL_U2C[0xF8F2] = 0xED; // LEFT CURLY BRACKET MID
		ADBSYMBOL_U2C[0xF8F3] = 0xEE; // LEFT CURLY BRACKET BOTTOM
		ADBSYMBOL_U2C[0xF8F4] = 0xEF; // CURLY BRACKET EXTENDER
		ADBSYMBOL_U2C[0x232A] = 0xF1; // RIGHT-POINTING ANGLE BRACKET
		ADBSYMBOL_U2C[0x222B] = 0xF2; // INTEGRAL
		ADBSYMBOL_U2C[0x2320] = 0xF3; // TOP HALF INTEGRAL
		ADBSYMBOL_U2C[0xF8F5] = 0xF4; // INTEGRAL EXTENDER
		ADBSYMBOL_U2C[0x2321] = 0xF5; // BOTTOM HALF INTEGRAL
		ADBSYMBOL_U2C[0xF8F6] = 0xF6; // RIGHT PAREN TOP
		ADBSYMBOL_U2C[0xF8F7] = 0xF7; // RIGHT PAREN EXTENDER
		ADBSYMBOL_U2C[0xF8F8] = 0xF8; // RIGHT PAREN BOTTOM
		ADBSYMBOL_U2C[0xF8F9] = 0xF9; // RIGHT SQUARE BRACKET TOP
		ADBSYMBOL_U2C[0xF8FA] = 0xFA; // RIGHT SQUARE BRACKET EXTENDER
		ADBSYMBOL_U2C[0xF8FB] = 0xFB; // RIGHT SQUARE BRACKET BOTTOM
		ADBSYMBOL_U2C[0xF8FC] = 0xFC; // RIGHT CURLY BRACKET TOP
		ADBSYMBOL_U2C[0xF8FD] = 0xFD; // RIGHT CURLY BRACKET MID
		ADBSYMBOL_U2C[0xF8FE] = 0xFE; // RIGHT CURLY BRACKET BOTTOM
	}
	
	
	@Override
	public int encode(final int codepoint) {
		return (codepoint >= 0 && codepoint < 0xffff) ? ADBSYMBOL_U2C[codepoint] : codepoint;
	}
	
	@Override
	public String encode(final String s) {
		final char[] encodedChars = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			final char c = s.charAt(i);
			encodedChars[i] = (c >= 0 && c < 0xffff) ? ADBSYMBOL_U2C[c] : c;
		}
		return new String(encodedChars);
	}
	
}
