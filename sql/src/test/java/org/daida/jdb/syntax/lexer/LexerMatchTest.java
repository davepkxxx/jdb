package org.daida.jdb.syntax.lexer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexerMatchTest {

    @Test
    void getMatchText() {
        // full match
        var text = "SELECT";
        var ins = new LexerMatch(LexerSymbol.SELECT, text, 0, text.length());
        assertEquals(ins.getMatchText(), text);
        // no match
        text = "SELECT";
        ins = new LexerMatch(LexerSymbol.SELECT, text, 0, 0);
        assertEquals(ins.getMatchText(), "");
        // match part
        text = "SELECT";
        ins = new LexerMatch(LexerSymbol.SELECT, text, 1, text.length() - 1);
        assertEquals(ins.getMatchText(), "ELEC");
    }
}