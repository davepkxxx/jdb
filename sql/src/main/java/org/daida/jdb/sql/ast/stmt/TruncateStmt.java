package org.daida.jdb.sql.ast.stmt;

import org.daida.jdb.sql.ast.Identifier;

public record TruncateStmt(Identifier table) implements Statement {
}
