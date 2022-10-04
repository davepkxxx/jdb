package org.daida.jdb.sql.ast.expr;

public record Between(Expression value, And and) implements Expression {
}
