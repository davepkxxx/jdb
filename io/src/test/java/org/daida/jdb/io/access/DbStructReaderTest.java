package org.daida.jdb.io.access;

import org.daida.jdb.lang.reflect.Fields;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class DbStructReaderTest {
    private DbStructReader instance;

    @BeforeEach
    void setUp() {
        instance = new DbStructReader();
    }

    @AfterEach
    void tearDown() throws IOException {
        instance.close();
    }

    @Test
    void readTables() {
        var ops = new DumperOptions();
        ops.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        var yaml = new Yaml(ops);
        var txt = new Yaml(ops).dump(new HashMap<>() {{
            put("tables", new ArrayList<>() {{
                add(new HashMap<>() {{
                    put("id", "1");
                    put("name", "table1");
                    put("columnIds", new ArrayList<>() {{
                        add("a");
                        add("b");
                    }});
                }});
                add(new HashMap<>() {{
                    put("id", "2");
                    put("name", "table2");
                    put("columnIds", new ArrayList<>() {{
                        add("c");
                        add("d");
                    }});
                }});
            }});
            put("columns", new ArrayList<>() {{
                add(new HashMap<>() {{
                    put("id", "a");
                    put("name", "colA");
                }});
                add(new HashMap<>() {{
                    put("id", "b");
                    put("name", "colB");
                }});
                add(new HashMap<>() {{
                    put("id", "c");
                    put("name", "colC");
                }});
                add(new HashMap<>() {{
                    put("id", "d");
                    put("name", "colD");
                }});
            }});
        }});

        System.out.println(txt);
        Fields.setFieldValue(instance, "input", new ByteArrayInputStream(txt.getBytes()));
        var res = instance.read();
        System.out.println(res);
    }
}