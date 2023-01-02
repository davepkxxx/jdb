package org.daida.jdb.io.access;

import org.daida.jdb.io.rel.*;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;

public class StructReader implements Closeable {
    private final Reader reader;

    private final Yaml yaml;

    public StructReader(Reader reader) {
        this.reader = reader;
        this.yaml = this.newYaml();
    }

    private Yaml newYaml() {
        Constructor ctor = new Constructor(DbStruct.class);
        TypeDescription desc = new TypeDescription(DbStruct.class);
        desc.addPropertyParameters("tables", Table.class);
        desc.addPropertyParameters("columns", Column.class);
        desc.addPropertyParameters("primaryKeys", PrimaryKey.class);
        desc.addPropertyParameters("foreignKeys", ForeignKey.class);
        ctor.addTypeDescription(desc);
        return new Yaml(ctor);
    }

    public DbStruct read() {
        return yaml.loadAs(reader, DbStruct.class);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
