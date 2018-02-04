package com.lxw.javap.parser;

import com.lxw.javap.model.constant.CONSTANT_Utf8;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Utf8InfoParser {
    public static CONSTANT_Utf8 parserConstantPool(DataInputStream dataInputStream) throws IOException {
        short length = dataInputStream.readShort();
        byte[] bytes = new byte[length];
        dataInputStream.read(bytes);
        String utf8String = new String(bytes, Charset.forName("utf-8"));
        return CONSTANT_Utf8.builder().length(length).utf8String(utf8String).build();
    }
}
