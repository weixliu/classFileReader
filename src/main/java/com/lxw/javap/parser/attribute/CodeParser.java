package com.lxw.javap.parser.attribute;

import com.lxw.javap.model.AbstractAtrributeInfo;
import com.lxw.javap.model.CpInfo;
import com.lxw.javap.model.attributes.Code;
import com.lxw.javap.model.attributes.ExceptionInfo;
import com.lxw.javap.parser.AbstractAttributeParser;

import java.io.DataInputStream;
import java.io.IOException;

public class CodeParser {
    public static Code parserCode(DataInputStream dataInputStream, CpInfo[] cpInfos, short attributeNameIndex) throws IOException {
        int attributeLength = dataInputStream.readInt();
        short maxStack = dataInputStream.readShort();
        short maxLocals = dataInputStream.readShort();
        int codeLength = dataInputStream.readInt();
        byte[] code = new byte[codeLength];
        dataInputStream.read(code);
        short exceptionTableLength = dataInputStream.readShort();
        ExceptionInfo[] exceptionInfos = ExceptionInfoParser.parserExceptionInfoArrays(dataInputStream, exceptionTableLength);
        short attributesCount = dataInputStream.readShort();
        AbstractAtrributeInfo[] attributeInfos = AbstractAttributeParser.parserAttributeArrays(dataInputStream, attributesCount, cpInfos);
        Code codeInfo = Code.builder().attributeNameIndex(attributeNameIndex)
                .attributeLength(attributeLength)
                .maxStack(maxStack)
                .maxLocals(maxLocals)
                .codeLength(codeLength)
                .code(code)
                .exceptionTableLength(exceptionTableLength)
                .exceptionTable(exceptionInfos)
                .attributeLength(attributesCount)
                .attributeInfos(attributeInfos)
                .build();
        return codeInfo;
    }
}
