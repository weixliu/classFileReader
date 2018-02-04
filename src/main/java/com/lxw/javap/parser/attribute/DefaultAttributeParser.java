package com.lxw.javap.parser.attribute;

import com.lxw.javap.model.AttributeInfo;

import java.io.DataInputStream;
import java.io.IOException;

public class DefaultAttributeParser {
    public static AttributeInfo parserAttributeInfo(DataInputStream dataInputStream, short attributeNameIndex) throws IOException {
        int attributeLength = dataInputStream.readInt();
        byte[] bytes = new byte[attributeLength];
        dataInputStream.read(bytes);
        AttributeInfo attributeInfo = AttributeInfo.builder().attributeNameIndex(attributeNameIndex).attributeLength(attributeLength)
                .bytes(bytes).build();
        return attributeInfo;
    }
}
