package org.daida.jdb.io.rel;

public enum StructType {
    TABLE("table"),
    COLUMN("column"),
    PRIMARY_KEY("primary key"),
    FOREIGN_KEY("foreign key");

    private String name;

    StructType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
