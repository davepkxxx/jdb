package org.daida.jdb.io.access;

import java.io.*;

public class DbStructInputStream extends FileInputStream {
    public DbStructInputStream() throws FileNotFoundException {
        super(Config.getStructFile());
    }
}
