package com.lxw.javap.parser;

import com.lxw.javap.model.AbstractAtrributeInfo;
import com.lxw.javap.model.CpInfo;
import com.lxw.javap.model.constant.CONSTANT_Utf8;
import com.lxw.javap.parser.attribute.CodeParser;
import com.lxw.javap.parser.attribute.DefaultAttributeParser;

import java.io.DataInputStream;
import java.io.IOException;

public class AbstractAttributeParser {
    public static AbstractAtrributeInfo[] parserAttributeArrays(DataInputStream dataInputStream, short length, CpInfo[] cpInfos) throws IOException {
        AbstractAtrributeInfo[] attributeInfos = new AbstractAtrributeInfo[length];
        for (int i = 0; i < length; i++) {
            attributeInfos[i] = parserAttributeInfo(dataInputStream, cpInfos);
        }
        return attributeInfos;
    }

    public static AbstractAtrributeInfo parserAttributeInfo(DataInputStream dataInputStream, CpInfo[] cpInfos) throws IOException {
        short attributeNameIndex = dataInputStream.readShort();
        int idx = attributeNameIndex;
        if (cpInfos[idx - 1] instanceof CONSTANT_Utf8) {
            String attributeName = ((CONSTANT_Utf8) cpInfos[idx - 1]).getUtf8String();
            switch (attributeName) {
                case "Code":
                    return CodeParser.parserCode(dataInputStream, cpInfos, attributeNameIndex);
                default:
                    return DefaultAttributeParser.parserAttributeInfo(dataInputStream, attributeNameIndex);
            }
        } else {
            return DefaultAttributeParser.parserAttributeInfo(dataInputStream, attributeNameIndex);
        }
    }
}

