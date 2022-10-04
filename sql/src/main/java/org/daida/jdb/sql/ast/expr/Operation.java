package org.daida.jdb.sql.ast.expr;

import org.daida.jdb.sql.parse.antlr.SqlLexer;

import java.util.Arrays;

public record Operation(Expression left, Expression right, Integer operator) implements OperationExpression {
    public static final int[] operators = new int[]{
            SqlLexer.MINUS,
            SqlLexer.PERCENT,
            SqlLexer.PLUS,
            SqlLexer.SLASH,
            SqlLexer.STAR
    };

    public static boolean isOperator(int operator) {
        return Arrays.stream(Comparison.operators).anyMatch(value -> value == operator);
    }
}
