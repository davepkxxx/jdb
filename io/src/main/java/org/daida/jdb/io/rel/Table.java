package org.daida.jdb.io.rel;

import java.util.List;
import java.util.stream.Collectors;

import static org.daida.jdb.io.rel.StructType.*;

public class Table implements ThrowNotFound {
    private String id;

    private String name;

    private List<String> columnIds;

    private List<Column> columns;

    private String primaryKeyId;

    private PrimaryKey primaryKey;

    private List<String> foreignKeyIds;

    private List<ForeignKey> foreignKeys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getColumnIds() {
        return columnIds;
    }

    public void setColumnIds(List<String> columnIds) {
        this.columnIds = columnIds;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public String getPrimaryKeyId() {
        return primaryKeyId;
    }

    public void setPrimaryKeyId(String primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    public PrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(PrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    public List<String> getForeignKeyIds() {
        return foreignKeyIds;
    }

    public void setForeignKeyIds(List<String> foreignKeyIds) {
        this.foreignKeyIds = foreignKeyIds;
    }

    public List<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(List<ForeignKey> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    @Override
    public StructType getStructType() {
        return TABLE;
    }

    void init(DbStruct structure) {
        this.setColumns(this.getColumnIds().stream().map(colId ->
                structure.getColumns().stream().filter(col ->
                        col.getId().equals(colId)
                ).findFirst().orElseGet(this.notFoundSupplier(colId, COLUMN))
        ).collect(Collectors.toList()));
        this.setPrimaryKey(structure.getPrimaryKeys().stream().filter(key ->
                key.getId().equals(this.getPrimaryKeyId())
        ).findFirst().orElseGet(this.notFoundSupplier(this.getPrimaryKeyId(), PRIMARY_KEY)));
        this.setForeignKeys(this.getForeignKeyIds().stream().map(keyId ->
                structure.getForeignKeys().stream().filter(key ->
                        key.getId().equals(keyId)
                ).findFirst().orElseGet(this.notFoundSupplier(keyId, FOREIGN_KEY))
        ).collect(Collectors.toList()));
    }
}
