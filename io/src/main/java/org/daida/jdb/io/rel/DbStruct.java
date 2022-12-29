package org.daida.jdb.io.rel;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class DbStruct {
    private List<Table> tables = Collections.emptyList();
    private List<Column> columns = Collections.emptyList();
    private List<PrimaryKey> primaryKeys = Collections.emptyList();
    private List<ForeignKey> foreignKeys = Collections.emptyList();

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<PrimaryKey> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<PrimaryKey> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public List<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(List<ForeignKey> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    public void init() {
        this.getTables().forEach(tab -> tab.init(this));
        this.getColumns().forEach(col -> col.init(this));
        this.getPrimaryKeys().forEach(key -> key.init(this));
        this.getForeignKeys().forEach(key -> key.init(this));
    }
}
