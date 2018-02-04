package com.lxw.javap.parser;

import com.lxw.javap.model.AbstractAtrributeInfo;
import com.lxw.javap.model.ClassBody;
import com.lxw.javap.model.CpInfo;
import com.lxw.javap.model.FieldInfo;
import com.lxw.javap.model.MethodInfo;

import java.io.DataInputStream;
import java.io.IOException;

public class ClassParser {

    public static ClassBody parserClass(DataInputStream dataInputStream) throws IOException {

        int magic = dataInputStream.readInt();

        short minorVersion = dataInputStream.readShort();

        short majorVersion = dataInputStream.readShort();

        short constantPoolCount = dataInputStream.readShort();

        CpInfo[] cpInfos = ConstantPoolParser.parserConstantPool(dataInputStream, constantPoolCount);

        short accessFlag = dataInputStream.readShort();

        short thisClass = dataInputStream.readShort();

        short superClass = dataInputStream.readShort();

        short interfacesCount = dataInputStream.readShort();

        short[] interfaces = new short[interfacesCount];

        for (int i = 0; i < interfacesCount; i++) {
            interfaces[i] = dataInputStream.readShort();
        }

        short fieldsCount = dataInputStream.readShort();

        FieldInfo[] fieldInfos = FieldParser.parserFieldArrays(dataInputStream, fieldsCount, cpInfos);

        short methodsCount = dataInputStream.readShort();

        MethodInfo[] methodInfos = MethodParser.parserMethodArrays(dataInputStream, methodsCount, cpInfos);

        short attributesCount = dataInputStream.readShort();

        AbstractAtrributeInfo[] attributeInfos = AbstractAttributeParser.parserAttributeArrays(dataInputStream, attributesCount, cpInfos);

        ClassBody classBody = ClassBody.builder()
                .magic(magic)
                .minorVersion(minorVersion)
                .majorVersion(majorVersion)
                .constantPoolCount(constantPoolCount)
                .cpInfos(cpInfos)
                .accessFlag(accessFlag)
                .thisClass(thisClass)
                .superClass(superClass)
                .interfacesCount(interfacesCount)
                .interfaces(interfaces)
                .fieldsCount(fieldsCount)
                .fieldInfos(fieldInfos)
                .methodsCount(methodsCount)
                .methodInfos(methodInfos)
                .attributesCount(attributesCount)
                .attributeInfos(attributeInfos)
                .build();
        return classBody;
    }
}
