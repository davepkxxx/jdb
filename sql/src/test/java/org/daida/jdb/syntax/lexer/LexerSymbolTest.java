package org.daida.jdb.syntax.lexer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexerSymbolTest {

    @Test
    void isDynamicValue() {
        // keywords
        assertFalse(LexerSymbol.SELECT.isDynamicValue());
        assertFalse(LexerSymbol.FROM.isDynamicValue());
        // signs
        assertFalse(LexerSymbol.COMMA.isDynamicValue());
        // dynamic
        assertTrue(LexerSymbol.WHITESPACE.isDynamicValue());
        assertTrue(LexerSymbol.NAME.isDynamicValue());
    }
}