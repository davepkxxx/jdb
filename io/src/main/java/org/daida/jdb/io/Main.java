package org.daida.jdb.io;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(new File(System.getProperty("user.home")).exists());
    }
}
