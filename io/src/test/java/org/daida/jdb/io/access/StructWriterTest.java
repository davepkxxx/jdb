package org.daida.jdb.io.access;

import org.daida.jdb.io.rel.*;
import org.daida.jdb.test.mock.AbstractMocked;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StructWriterTest {
    @Nested
    class WriteTest {
        StringWriter value;

        StructWriter instance;

        DbStruct param;

        @BeforeEach
        void setUp() {
            this.value = new StringWriter();
            this.instance = new StructWriter(this.value);
            this.param = new DbStruct();
        }

        @AfterEach
        void tearDown() throws IOException {
            this.instance.close();
        }

        @Test
        void write() throws IOException {
            instance.write(param);
            assertEquals(value.toString(), """
                    --- {}
                    """);
        }

        @Test
        void tables() throws IOException {
            param.setTables(new ArrayList<>() {{
                var el = new Table();
                el.setId("a136dc36-5ab7-4d5a-a2a2-138965a3bb13");
                el.setName("a05369af");
                el.setColumnIds(new ArrayList<>() {{
                    add("9ad27573-f0bb-4610-94b2-8ffcc910454b");
                }});
                el.setColumns(new ArrayList<>() {{
                    add(new Column("9ad27573-f0bb-4610-94b2-8ffcc910454b"));
                }});
                add(el);
                el = new Table();
                el.setId("293b0a54-a841-52c0-799d-3653bec4eb84");
                el.setName("ea8ce22b");
                el.setColumnIds(new ArrayList<>() {{
                    add("9b243402-3da2-a553-3dff-5d16eb12c8b3");
                    add("158c9449-4930-3c06-7c06-a1dae51e3114");
                }});
                el.setColumns(new ArrayList<>() {{
                    add(new Column("9b243402-3da2-a553-3dff-5d16eb12c8b3"));
                    add(new Column("158c9449-4930-3c06-7c06-a1dae51e3114"));
                }});
                el.setPrimaryKeyId("41afb83a-429d-c8b8-7e3c-d4a196f58db1");
                el.setPrimaryKey(new PrimaryKey("41afb83a-429d-c8b8-7e3c-d4a196f58db1"));
                el.setForeignKeyIds(new ArrayList<>() {{
                    add("16f8583e-1005-bbdc-751f-a5c7fea9f43a");
                    add("c0c9fa64-d4b4-eee0-ddf8-e911cb52179a");
                }});
                el.setForeignKeys(new ArrayList<>() {{
                    add(new ForeignKey("16f8583e-1005-bbdc-751f-a5c7fea9f43a"));
                    add(new ForeignKey("c0c9fa64-d4b4-eee0-ddf8-e911cb52179a"));
                }});
                add(el);
            }});
            instance.write(param);
            assertEquals(value.toString(), """
                    ---
                    tables:
                    - id: "a136dc36-5ab7-4d5a-a2a2-138965a3bb13"
                      name: "a05369af"
                      columnIds:
                      - "9ad27573-f0bb-4610-94b2-8ffcc910454b"
                    - id: "293b0a54-a841-52c0-799d-3653bec4eb84"
                      name: "ea8ce22b"
                      columnIds:
                      - "9b243402-3da2-a553-3dff-5d16eb12c8b3"
                      - "158c9449-4930-3c06-7c06-a1dae51e3114"
                      primaryKeyId: "41afb83a-429d-c8b8-7e3c-d4a196f58db1"
                      foreignKeyIds:
                      - "16f8583e-1005-bbdc-751f-a5c7fea9f43a"
                      - "c0c9fa64-d4b4-eee0-ddf8-e911cb52179a"
                    """);
        }

        @Test
        void columns() throws IOException {
            param.setColumns(new ArrayList<>() {{
                var el = new Column();
                el.setId("96f39f96-637c-adf1-7411-1065327d2eaf");
                el.setName("cc33ef23");
                el.setTableId("bff53106-006a-1834-a2c5-65b97119e02e");
                el.setTable(new Table("bff53106-006a-1834-a2c5-65b97119e02e"));
                el.setDataType("CHAR");
                el.setDataLength(98);
                el.setNotNull(false);
                add(el);
                el = new Column();
                el.setId("48728e38-1c7d-f9bf-e98a-eb3752d554be");
                el.setName("bcc230a6");
                el.setTableId("0e1ed768-722b-8475-5844-eb879f26c7be");
                el.setTable(new Table("0e1ed768-722b-8475-5844-eb879f26c7be"));
                el.setDataType("NUMERIC");
                el.setDataLength(7);
                el.setDataPrecision(1);
                el.setNotNull(true);
                el.setPrimaryKeyId("452d9fe5-781d-6ccf-45ad-767a83709d89");
                el.setPrimaryKey(new PrimaryKey("452d9fe5-781d-6ccf-45ad-767a83709d89"));
                el.setForeignKeyIds(new ArrayList<>() {{
                    add("4341bdb0-09a2-315f-6862-4b0185b51a55");
                    add("1dc0bd5d-6dc0-f08a-4a6a-06dd5d065887");
                }});
                el.setForeignKeys(new ArrayList<>() {{
                    add(new ForeignKey("4341bdb0-09a2-315f-6862-4b0185b51a55"));
                    add(new ForeignKey("1dc0bd5d-6dc0-f08a-4a6a-06dd5d065887"));
                }});
                add(el);
            }});
            instance.write(param);
            assertEquals(value.toString(), """
                    ---
                    columns:
                    - id: "96f39f96-637c-adf1-7411-1065327d2eaf"
                      name: "cc33ef23"
                      dataType: "CHAR"
                      dataLength: 98
                      notNull: false
                      tableId: "bff53106-006a-1834-a2c5-65b97119e02e"
                    - id: "48728e38-1c7d-f9bf-e98a-eb3752d554be"
                      name: "bcc230a6"
                      dataType: "NUMERIC"
                      dataLength: 7
                      dataPrecision: 1
                      notNull: true
                      tableId: "0e1ed768-722b-8475-5844-eb879f26c7be"
                      primaryKeyId: "452d9fe5-781d-6ccf-45ad-767a83709d89"
                      foreignKeyIds:
                      - "4341bdb0-09a2-315f-6862-4b0185b51a55"
                      - "1dc0bd5d-6dc0-f08a-4a6a-06dd5d065887"
                    """);
        }

        @Test
        void primaryKeys() throws IOException {
            param.setPrimaryKeys(new ArrayList<>() {{
                var el = new PrimaryKey();
                el.setId("87d21b0c-95d6-39b7-f823-adf184326246");
                el.setName("f8df343b");
                el.setTableId("513b01e0-2409-c819-a4cd-3c8c135f9104");
                el.setTable(new Table("513b01e0-2409-c819-a4cd-3c8c135f9104"));
                el.setColumnIds(new ArrayList<>() {{
                    add("9afa954e-7151-92f0-eda2-31e5be7c96ec");
                    add("94a010ce-9cb5-dcf6-705b-11e076ceb1de");
                }});
                el.setColumns(new ArrayList<>() {{
                    add(new Column("9afa954e-7151-92f0-eda2-31e5be7c96ec"));
                    add(new Column("94a010ce-9cb5-dcf6-705b-11e076ceb1de"));
                }});
                add(el);
            }});
            instance.write(param);
            assertEquals(value.toString(), """
                    ---
                    primaryKeys:
                    - id: "87d21b0c-95d6-39b7-f823-adf184326246"
                      name: "f8df343b"
                      tableId: "513b01e0-2409-c819-a4cd-3c8c135f9104"
                      columnIds:
                      - "9afa954e-7151-92f0-eda2-31e5be7c96ec"
                      - "94a010ce-9cb5-dcf6-705b-11e076ceb1de"
                    """);
        }

        @Test
        void foreignKeys() throws IOException {
            param.setForeignKeys(new ArrayList<>() {{
                var el = new ForeignKey();
                el.setId("0b874a05-fa91-a0c9-926a-25be43d702b5");
                el.setName("a4f414e8");
                el.setTableId("8bcc1471-921a-723e-909c-89c6ca5f1f13");
                el.setTable(new Table("8bcc1471-921a-723e-909c-89c6ca5f1f13"));
                el.setReferenceTableId("4ec881c9-5647-f7cc-4234-3389b49f997b");
                el.setReferenceTable(new Table("4ec881c9-5647-f7cc-4234-3389b49f997b"));
                el.setColumnIds(new ArrayList<>() {{
                    add("d9b3139d-4a56-bc85-8e7b-36ac69b9c0a9");
                    add("288d389d-0240-7f56-bb86-04b84bb6f44d");
                }});
                el.setColumns(new ArrayList<>() {{
                    add(new Column("d9b3139d-4a56-bc85-8e7b-36ac69b9c0a9"));
                    add(new Column("288d389d-0240-7f56-bb86-04b84bb6f44d"));
                }});
                el.setReferenceColumnIds(new ArrayList<>() {{
                    add("7e0d00a8-5a2d-6b49-069c-9d94448d84a8");
                    add("91f5a429-f597-baad-4c18-f026b05407f9");
                }});
                el.setReferenceColumns(new ArrayList<>() {{
                    add(new Column("7e0d00a8-5a2d-6b49-069c-9d94448d84a8"));
                    add(new Column("91f5a429-f597-baad-4c18-f026b05407f9"));
                }});
                el.setColumnMapper(new HashMap<>() {{
                    put(new Column("d9b3139d-4a56-bc85-8e7b-36ac69b9c0a9"), new Column("7e0d00a8-5a2d-6b49-069c-9d94448d84a8"));
                    put(new Column("288d389d-0240-7f56-bb86-04b84bb6f44d"), new Column("91f5a429-f597-baad-4c18-f026b05407f9"));
                }});
                add(el);
            }});
            instance.write(param);
            assertEquals(value.toString(), """
                    ---
                    foreignKeys:
                    - id: "0b874a05-fa91-a0c9-926a-25be43d702b5"
                      name: "a4f414e8"
                      tableId: "8bcc1471-921a-723e-909c-89c6ca5f1f13"
                      referenceTableId: "4ec881c9-5647-f7cc-4234-3389b49f997b"
                      columnIds:
                      - "d9b3139d-4a56-bc85-8e7b-36ac69b9c0a9"
                      - "288d389d-0240-7f56-bb86-04b84bb6f44d"
                      referenceColumnIds:
                      - "7e0d00a8-5a2d-6b49-069c-9d94448d84a8"
                      - "91f5a429-f597-baad-4c18-f026b05407f9"
                    """);
        }
    }

    @Nested
    class CloseTest extends AbstractMocked {
        @Mock
        Writer mocked;

        StructWriter instance;

        @BeforeEach
        public void setUp() {
            super.setUp();
            this.instance = new StructWriter(mocked);
        }

        @Test
        void close() throws IOException {
            assertDoesNotThrow(() -> instance.close());
            verify(mocked).close();
        }

        @Test
        void throwIOException() throws IOException {
            doThrow(IOException.class).when(mocked).close();
            assertThrows(IOException.class, () -> instance.close());
        }
    }
}