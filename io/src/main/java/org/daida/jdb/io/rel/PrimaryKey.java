package org.daida.jdb.io.rel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.daida.jdb.lang.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.daida.jdb.io.rel.StructType.*;

public class PrimaryKey implements StructModel, StructInit {
    private String id;

    private String name;

    private String tableId;

    @JsonIgnore
    private Table table;

    private List<String> columnIds = Collections.emptyList();

    @JsonIgnore
    private List<Column> columns;

    public PrimaryKey() {
    }

    public PrimaryKey(String id) {
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

    @Override
    @JsonIgnore
    public StructType getStructType() {
        return PRIMARY_KEY;
    }

    void init(@NotNull DbStruct struct) {
        this.setTable(this.find(struct.getTables(), this.getTableId(), TABLE));
        this.setColumns(this.filter(struct.getColumns(), this.getColumnIds(), COLUMN));
    }
}
