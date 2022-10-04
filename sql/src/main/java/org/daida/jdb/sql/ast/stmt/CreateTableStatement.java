package org.daida.jdb.sql.ast.stmt;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.clause.ColumnClause;
import org.daida.jdb.sql.ast.clause.ForeignKeyClause;
import org.daida.jdb.sql.ast.clause.PrimaryKeyClause;

import java.util.List;

public record CreateTableStatement(
        Identifier table,
        List<ColumnClause> columnClauses,
        PrimaryKeyClause primaryKeyClause,
        List<ForeignKeyClause> foreignKeyClauses
) implements Statement {
}
