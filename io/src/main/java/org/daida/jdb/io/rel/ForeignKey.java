package org.daida.jdb.io.rel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.daida.jdb.lang.NotNull;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.daida.jdb.io.rel.StructType.*;

public class ForeignKey implements StructModel, StructInit, ThrowNumDiff {
    private String id;

    private String name;

    private String tableId;

    @JsonIgnore
    private Table table;

    private String referenceTableId;

    @JsonIgnore
    private Table referenceTable;

    private List<String> columnIds = Collections.emptyList();

    @JsonIgnore
    private List<Column> columns;

    private List<String> referenceColumnIds = Collections.emptyList();

    @JsonIgnore
    private List<Column> referenceColumns;

    @JsonIgnore
    private Map<Column, Column> columnMapper;

    public ForeignKey() {
    }

    public ForeignKey(String id) {
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

    public String getReferenceTableId() {
        return referenceTableId;
    }

    public void setReferenceTableId(String referenceTableId) {
        this.referenceTableId = referenceTableId;
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
    @JsonIgnore
    public StructType getStructType() {
        return FOREIGN_KEY;
    }

    void init(@NotNull DbStruct struct) {
        this.setTable(this.find(struct.getTables(), this.getTableId(), TABLE));
        this.setReferenceTable(this.find(struct.getTables(), this.getReferenceTableId(), TABLE));
        this.setColumns(this.filter(struct.getColumns(), this.getColumnIds(), COLUMN));
        this.setReferenceColumns(this.filter(struct.getColumns(), this.getReferenceColumnIds(), COLUMN));

        if (this.getColumns().size() != this.getReferenceColumns().size()) {
            this.throwNumDiff("columns");
        }
        var that = this;
        this.setColumnMapper(new LinkedHashMap<>() {{
            for (var i = 0; i < that.getColumns().size(); i++) {
                put(that.getColumns().get(i), that.getReferenceColumns().get(i));
            }
        }});
    }
}
