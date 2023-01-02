package org.daida.jdb.io.access;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.daida.jdb.io.rel.DbStruct;

import java.io.*;

public class StructWriter implements Closeable {
    private final Writer writer;

    private final ObjectMapper mapper;

    public StructWriter(Writer writer) {
        this.writer = writer;
        this.mapper = this.newMapper();
    }

    private ObjectMapper newMapper() {
        var mapper = new YAMLMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return mapper;
    }

    public void write(DbStruct struct) throws IOException {
        mapper.writeValue(writer, struct);
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}
