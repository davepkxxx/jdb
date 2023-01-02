package org.daida.jdb.io.rel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.daida.jdb.lang.NotNull;

import java.util.Collections;
import java.util.List;

import static org.daida.jdb.io.rel.StructType.*;

public class Column implements StructModel, StructInit {
    private String id;

    private String name;

    private String dataType;

    private Integer dataLength;

    private Integer dataPrecision;

    private Boolean notNull;

    private String tableId;

    @JsonIgnore
    private Table table;

    private String primaryKeyId;

    @JsonIgnore
    private PrimaryKey primaryKey;

    private List<String> foreignKeyIds = Collections.emptyList();

    @JsonIgnore

    private List<ForeignKey> foreignKeys;

    public Column() {
    }

    public Column(String id) {
        this.id = id;
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

    public Integer getDataPrecision() {
        return dataPrecision;
    }

    public void setDataPrecision(Integer dataPrecision) {
        this.dataPrecision = dataPrecision;
    }

    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
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
        return COLUMN;
    }

    void init(@NotNull DbStruct struct) throws StructNotFoundException {
        this.setTable(this.find(struct.getTables(), this.getTableId(), TABLE));
        this.setPrimaryKey(this.find(struct.getPrimaryKeys(), this.getPrimaryKeyId(), PRIMARY_KEY));
        this.setForeignKeys(this.filter(struct.getForeignKeys(), this.getForeignKeyIds(), FOREIGN_KEY));
    }
}
