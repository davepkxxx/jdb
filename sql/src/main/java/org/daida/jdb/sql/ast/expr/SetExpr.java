package org.daida.jdb.sql.ast.expr;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.SyntaxNode;

public record SetExpr(Identifier left, Expression right) implements SyntaxNode {
}
