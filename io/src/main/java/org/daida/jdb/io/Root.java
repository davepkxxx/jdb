package org.daida.jdb.io;

import java.io.File;

public record Root(String dir) {
    public Root newDefaultInstance() {
        return new Root("~/");
    }

    public File getFile() {
        return new File(this.dir);
    }
}
