package org.daida.jdb.io.rel;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.daida.jdb.io.rel.StructType.*;

public class Column implements ThrowNotFound {
    private String id;

    private String name;

    private String tableId;

    private Table table;

    private String dataType;

    private Integer dataLength;

    private Boolean notNull;

    private String primaryKeyId;

    private PrimaryKey primaryKey;

    private List<String> foreignKeyIds = Collections.emptyList();

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

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getDataLength() {
        return dataLength;
    }

    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
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
        return COLUMN;
    }

    void init(DbStruct structure) {
        this.setTable(structure.getTables().stream().filter(tab ->
                tab.getId().equals(this.getTableId())
        ).findFirst().orElseGet(this.notFoundSupplier(this.getTableId(), TABLE)));
        this.setPrimaryKey(structure.getPrimaryKeys().stream().filter(key ->
                key.getId().equals(this.getPrimaryKeyId())
        ).findFirst().orElseGet(this.notFoundSupplier(this.getPrimaryKeyId(), PRIMARY_KEY)));
        this.setForeignKeys(this.getForeignKeyIds().stream().map(keyId ->
                this.foreignKeys.stream().filter(key ->
                        key.getId().equals(keyId)
                ).findFirst().orElseGet(this.notFoundSupplier(keyId, FOREIGN_KEY))
        ).collect(Collectors.toList()));
    }
}
