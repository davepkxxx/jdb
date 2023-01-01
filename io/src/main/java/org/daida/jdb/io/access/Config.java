package org.daida.jdb.io.access;

import java.io.File;

public class Config {
    private Config() {}

    public static File getEnvDir() {
        String home = System.getProperty("user.home");
        File env = new File(home, ".jdb");
        if (!env.exists()) {
            env.mkdir();
        }
        return env;
    }

    public static File getStructFile() {
        return new File(Config.getEnvDir(), "table.yaml");
    }
}
