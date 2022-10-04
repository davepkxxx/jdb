package org.daida.jdb.sql.ast.expr;

import org.daida.jdb.sql.parse.antlr.SqlLexer;

import java.util.Arrays;

public record Comparison(Expression left, Expression right, Integer operator) implements ComparisonExpression {
    public static final int[] operators = new int[]{
            SqlLexer.EQ,
            SqlLexer.GREATER_THAN,
            SqlLexer.GREATER_THAN_OR_EQ,
            SqlLexer.LESS_THAN,
            SqlLexer.LESS_THAN_OR_EQ,
            SqlLexer.LIKE,
            SqlLexer.NOT_EQ,
    };

    public static boolean isOperator(int operator) {
        return Arrays.stream(Comparison.operators).anyMatch(value -> value == operator);
    }
}
