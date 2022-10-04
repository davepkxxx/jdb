package org.daida.jdb.sql.ast.expr;

public record Or(Expression left, Expression right) implements LogicalExpression {
}
