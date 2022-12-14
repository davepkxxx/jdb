package org.daida.jdb.io.rel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.daida.jdb.lang.NotNull;

import java.util.Collections;
import java.util.List;

import static org.daida.jdb.io.rel.StructType.*;

public class Table implements StructModel, StructInit {
    private String id;

    private String name;

    private List<String> columnIds = Collections.emptyList();

    @JsonIgnore
    private List<Column> columns;

    private String primaryKeyId;

    @JsonIgnore
    private PrimaryKey primaryKey;

    private List<String> foreignKeyIds = Collections.emptyList();

    @JsonIgnore
    private List<ForeignKey> foreignKeys;

    public Table() {
    }

    public Table(String id) {
        this.id = id;
    }

    public Table(String id, String name, List<String> columnIds) {
        this.id = id;
        this.name = name;
        this.columnIds = columnIds;
    }

    public Table(String id, String name, List<String> columnIds, String primaryKeyId, List<String> foreignKeyIds) {
        this.id = id;
        this.name = name;
        this.columnIds = columnIds;
        this.primaryKeyId = primaryKeyId;
        this.foreignKeyIds = foreignKeyIds;
    }

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
    @JsonIgnore
    public StructType getStructType() {
        return TABLE;
    }

    void init(@NotNull DbStruct struct) {
        this.setColumns(this.filter(struct.getColumns(), this.getColumnIds(), COLUMN));
        this.setPrimaryKey(this.find(struct.getPrimaryKeys(), this.getPrimaryKeyId(), PRIMARY_KEY));
        this.setForeignKeys(this.filter(struct.getForeignKeys(), this.getForeignKeyIds(), FOREIGN_KEY));
    }
}
