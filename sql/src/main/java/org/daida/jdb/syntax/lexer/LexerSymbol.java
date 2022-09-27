package org.daida.jdb.syntax.lexer;

/**
 * SQL lexer
 */
public enum LexerSymbol {
    // keywords
    SELECT,
    FROM,
    // signs
    COMMA,
    // dynamic
    WHITESPACE,
    NAME;

    public boolean isDynamicValue() {
        switch (this) {
            case WHITESPACE:
            case NAME:
                return true;
            default:
                return false;
        }
    }
}
