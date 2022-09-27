package org.daida.jdb.syntax.lexer;

public record LexerMatch(
        LexerSymbol symbol,
        String text,
        int start,
        int end
) {
    public String getMatchText() {
        return this.text.substring(this.start, this.end);
    }
}
