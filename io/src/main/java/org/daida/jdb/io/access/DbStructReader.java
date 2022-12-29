package org.daida.jdb.io.access;

import org.daida.jdb.io.rel.*;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbStructReader implements AutoCloseable {
    private InputStream input;

    public DbStructReader() {
        try {
            this.input = new FileInputStream(new File(this.getEnvDir(), "table.yaml"));
        } catch (FileNotFoundException e) {
            Logger.getLogger("jdb.io").log(Level.CONFIG, e.getMessage());
        }
    }

    private File getEnvDir() {
        String home = System.getProperty("user.home");
        File env = new File(home, ".jdb");
        if (!env.exists()) {
            env.mkdir();
        }
        return env;
    }

    public DbStruct read() {
        if (this.input == null) {
            return new DbStruct();
        } else {
            Constructor ctor = new Constructor(DbStruct.class);
            TypeDescription tableDesc = new TypeDescription(DbStruct.class);
            tableDesc.addPropertyParameters("tables", Table.class);
            tableDesc.addPropertyParameters("columns", Column.class);
            tableDesc.addPropertyParameters("primaryKeys", PrimaryKey.class);
            tableDesc.addPropertyParameters("foreignKeys", ForeignKey.class);
            ctor.addTypeDescription(tableDesc);
            return new Yaml(ctor).loadAs(input, DbStruct.class);
        }
    }


    @Override
    public void close() throws IOException {
        if (input != null) {
            input.close();
        }
    }
}
