package org.daida.jdb.sql.ast;

import org.daida.jdb.sql.ast.stmt.Statement;

import java.util.List;

public record Program(List<Statement> statements) implements SyntaxNode {
}
