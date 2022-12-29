package org.daida.jdb.io.rel;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.daida.jdb.io.rel.StructType.*;

public class PrimaryKey implements ThrowNotFound {
    private String id;
    private String name;
    private String tableId;
    private Table table;
    private List<String> columnIds = Collections.emptyList();
    private List<Column> columns;

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
    public StructType getStructType() {
        return PRIMARY_KEY;
    }

    void init(DbStruct structure) {
        this.setTable(structure.getTables().stream().filter(tab ->
                tab.getId().equals(this.getTableId())
        ).findFirst().orElseGet(this.notFoundSupplier(this.getTableId(), TABLE)));
        this.setColumns(this.getColumnIds().stream().map(colId ->
                this.columns.stream().filter(col ->
                        col.getId().equals(colId)
                ).findFirst().orElseGet(this.notFoundSupplier(colId, COLUMN))
        ).collect(Collectors.toList()));
    }
}
