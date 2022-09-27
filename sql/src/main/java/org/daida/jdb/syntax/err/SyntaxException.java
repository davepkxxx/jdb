package org.daida.jdb.syntax.err;

public class SyntaxException extends RuntimeException {
    private String text;
    private int index;

    public SyntaxException(String message, String text, int index) {
        super(message);
        this.text = text;
        this.index = index;
    }

    public static SyntaxException newExceptedInstance(String text, int index) {
        return new SyntaxException("excepted '" + text.charAt(index) + "'", text, index);
    }
}
