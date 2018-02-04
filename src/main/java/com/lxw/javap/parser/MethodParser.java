package com.lxw.javap.parser;

import com.lxw.javap.model.AbstractAtrributeInfo;
import com.lxw.javap.model.CpInfo;
import com.lxw.javap.model.MethodInfo;

import java.io.DataInputStream;
import java.io.IOException;

public class MethodParser {
    public static MethodInfo[] parserMethodArrays(DataInputStream dataInputStream, short length, CpInfo[] cpInfos) throws IOException {
        MethodInfo[] methodInfos = new MethodInfo[length];
        for (int i = 0; i < length; i++) {
            methodInfos[i] = parserMethodInfo(dataInputStream, cpInfos);
        }
        return methodInfos;
    }

    public static MethodInfo parserMethodInfo(DataInputStream dataInputStream, CpInfo[] cpInfos) throws IOException {
        short accessFlags = dataInputStream.readShort();
        short nameIndex = dataInputStream.readShort();
        short descriptorIndex = dataInputStream.readShort();
        short attributesCount = dataInputStream.readShort();
        AbstractAtrributeInfo[] attributeInfos = AbstractAttributeParser.parserAttributeArrays(dataInputStream, attributesCount, cpInfos);
        MethodInfo methodInfo = MethodInfo.builder().accessFlags(accessFlags).nameIndex(nameIndex).descriptorIndex(descriptorIndex)
                .attributesCount(attributesCount).attributeInfos(attributeInfos).build();
        return methodInfo;
    }
}
