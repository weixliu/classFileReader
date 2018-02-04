package com.lxw.javap.parser;

import com.lxw.javap.model.AbstractAtrributeInfo;
import com.lxw.javap.model.CpInfo;
import com.lxw.javap.model.FieldInfo;

import java.io.DataInputStream;
import java.io.IOException;

public class FieldParser {
    public static FieldInfo[] parserFieldArrays(DataInputStream dataInputStream, short length, CpInfo[] cpInfos) throws IOException {
        FieldInfo[] fieldInfos = new FieldInfo[length];
        for (int i = 0; i < length; i++) {
            fieldInfos[i] = parserFieldInfo(dataInputStream, cpInfos);
        }
        return fieldInfos;
    }

    public static FieldInfo parserFieldInfo(DataInputStream dataInputStream, CpInfo[] cpInfos) throws IOException {
        short accessFlags = dataInputStream.readShort();
        short nameIndex = dataInputStream.readShort();
        short descriptorIndex = dataInputStream.readShort();
        short attributesCount = dataInputStream.readShort();
        AbstractAtrributeInfo[] attributeInfos = AbstractAttributeParser.parserAttributeArrays(dataInputStream, attributesCount, cpInfos);
        FieldInfo fieldInfo = FieldInfo.builder().accessFlags(accessFlags).nameIndex(nameIndex).descriptorIndex(descriptorIndex)
                .attributesCount(attributesCount).attributeInfos(attributeInfos).build();
        return fieldInfo;
    }
}
