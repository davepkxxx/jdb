package org.daida.jdb.io.rel;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.daida.jdb.io.rel.StructType.*;

public class ForeignKey implements ThrowNotFound, ThrowNumDiff {
    private String id;

    private String name;

    private String tableId;

    private Table table;

    private String foreignTableId;

    private Table referenceTable;

    private List<String> columnIds = Collections.emptyList();

    private List<Column> columns;

    private List<String> referenceColumnIds = Collections.emptyList();

    private List<Column> referenceColumns;

    private Map<Column, Column> columnMapper;

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

    public String getForeignTableId() {
        return foreignTableId;
    }

    public void setForeignTableId(String foreignTableId) {
        this.foreignTableId = foreignTableId;
    }

    public Table getReferenceTable() {
        return referenceTable;
    }

    public void setReferenceTable(Table referenceTable) {
        this.referenceTable = referenceTable;
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

    public List<String> getReferenceColumnIds() {
        return referenceColumnIds;
    }

    public void setReferenceColumnIds(List<String> referenceColumnIds) {
        this.referenceColumnIds = referenceColumnIds;
    }

    public List<Column> getReferenceColumns() {
        return referenceColumns;
    }

    public void setReferenceColumns(List<Column> referenceColumns) {
        this.referenceColumns = referenceColumns;
    }

    public Map<Column, Column> getColumnMapper() {
        return columnMapper;
    }

    public void setColumnMapper(Map<Column, Column> columnMapper) {
        this.columnMapper = columnMapper;
    }

    @Override
    public StructType getStructType() {
        return FOREIGN_KEY;
    }

    void init(DbStruct struct) {
        this.setTable(struct.getTables().stream().filter(tab ->
                tab.getId().equals(this.getTableId())
        ).findFirst().orElseGet(this.notFoundSupplier(this.getTableId(), TABLE)));
        this.setReferenceTable(struct.getTables().stream().filter(tab ->
                tab.getId().equals(this.getForeignTableId())
        ).findFirst().orElseGet(this.notFoundSupplier(this.getForeignTableId(), TABLE)));
        this.setColumns(this.getColumnIds().stream().map(colId ->
                struct.getColumns().stream().filter(col ->
                        col.getId().equals(colId)
                ).findFirst().orElseGet(this.notFoundSupplier(colId, COLUMN))
        ).toList());
        this.setReferenceColumns(this.getReferenceColumnIds().stream().map(colId ->
                struct.getColumns().stream().filter(col ->
                        col.getId().equals(colId)
                ).findFirst().orElseGet(this.notFoundSupplier(colId, COLUMN))
        ).toList());
        if (this.getColumns().size() != this.getReferenceColumns().size()) {
            this.throwNumDiff("columns");
        }
        var cols = this.getColumns();
        var refCols = this.getReferenceColumns();
        this.setColumnMapper(new LinkedHashMap<>() {{
            for (var i = 0; i < Math.max(cols.size(), refCols.size()); i++) {
                put(cols.get(i), refCols.get(i));
            }
        }});
    }
}
