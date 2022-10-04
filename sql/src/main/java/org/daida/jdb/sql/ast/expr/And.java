package org.daida.jdb.sql.ast.expr;

public record And(Expression left, Expression right) implements LogicalExpression {
}
