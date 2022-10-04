package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.SyntaxNode;

import java.util.List;

public record PrimaryKeyClause(Identifier key, List<Identifier> columns) implements SyntaxNode {
}
