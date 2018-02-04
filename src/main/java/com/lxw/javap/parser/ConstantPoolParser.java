package com.lxw.javap.parser;

import com.lxw.javap.model.CpInfo;
import com.lxw.javap.model.constant.CONSTANT_Class;
import com.lxw.javap.model.constant.CONSTANT_Fieldref;
import com.lxw.javap.model.constant.CONSTANT_Double;
import com.lxw.javap.model.constant.CONSTANT_Float;
import com.lxw.javap.model.constant.CONSTANT_Integer;
import com.lxw.javap.model.constant.CONSTANT_InterfaceMethodref;
import com.lxw.javap.model.constant.CONSTANT_InvokeDynamic;
import com.lxw.javap.model.constant.CONSTANT_Long;
import com.lxw.javap.model.constant.CONSTANT_MethodHandle;
import com.lxw.javap.model.constant.CONSTANT_Methodref;
import com.lxw.javap.model.constant.CONSTANT_MethodType;
import com.lxw.javap.model.constant.CONSTANT_NameAndType;
import com.lxw.javap.model.constant.CONSTANT_String;

import java.io.DataInputStream;
import java.io.IOException;

public class ConstantPoolParser {
    public static CpInfo[] parserConstantPool(DataInputStream dataInputStream, short length) throws IOException {
        CpInfo[] cpInfos = new CpInfo[length-1];
        for (int i = 0; i < length - 1; i++) {
            byte oneByte = dataInputStream.readByte();
            int tag = oneByte;
            CpInfo cpInfo = null;
            switch (tag) {
                case CpInfo.CONSTANT_Class:
                    short nameIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_Class.builder().nameIndex(nameIndex).build();
                    break;
                case CpInfo.CONSTANT_Fieldref:
                    short fieldIndex = dataInputStream.readShort();
                    short fieldNameAndTypeIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_Fieldref.builder().classIndex(fieldIndex).nameAndTypeIndex(fieldNameAndTypeIndex).build();
                    break;
                case CpInfo.CONSTANT_Methodref:
                    short methodIndex = dataInputStream.readShort();
                    short methodNameAndTypeIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_Methodref.builder().classIndex(methodIndex).nameAndTypeIndex(methodNameAndTypeIndex).build();
                    break;
                case CpInfo.CONSTANT_InterfaceMethodref:
                    short interfaceMethodIndex = dataInputStream.readShort();
                    short interfaceMethodNameAndTypeIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_InterfaceMethodref.builder().classIndex(interfaceMethodIndex).nameAndTypeIndex(interfaceMethodNameAndTypeIndex).build();
                    break;
                case CpInfo.CONSTANT_String:
                    short stringIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_String.builder().stringIndex(stringIndex).build();
                    break;
                case CpInfo.CONSTANT_Integer:
                    int intValue = dataInputStream.readInt();
                    cpInfo = CONSTANT_Integer.builder().intValue(intValue).build();
                    break;
                case CpInfo.CONSTANT_Float:
                    float floatValue = dataInputStream.readFloat();
                    cpInfo = CONSTANT_Float.builder().floatValue(floatValue).build();
                    break;
                case CpInfo.CONSTANT_Long:
//                    int h4bL = dataInputStream.readInt();
//                    int l4bL = dataInputStream.readInt();
//                    cpInfo = CONSTANT_Long.builder().high4Bytes(h4bL).low4Bytes(l4bL).build();
                    long longValue = dataInputStream.readLong();
                    cpInfo = CONSTANT_Long.builder().longValue(longValue).build();
                    break;
                case CpInfo.CONSTANT_Double:
//                    int h4bD = dataInputStream.readInt();
//                    int l4bD = dataInputStream.readInt();
//                    cpInfo = CONSTANT_Double.builder().high4Bytes(h4bD).low4Bytes(l4bD).build();
                    double doubleValue = dataInputStream.readDouble();
                    cpInfo = CONSTANT_Double.builder().doubleValue(doubleValue).build();
                    break;
                case CpInfo.CONSTANT_NameAndType:
                    short nameAndTypeIndex = dataInputStream.readShort();
                    short descriptorIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_NameAndType.builder().nameIndex(nameAndTypeIndex).descriptorIndex(descriptorIndex).build();
                    break;
                case CpInfo.CONSTANT_Utf8:
                    cpInfo = Utf8InfoParser.parserConstantPool(dataInputStream);
                    break;
                case CpInfo.CONSTANT_MethodHandle:
                    byte referenceKind = dataInputStream.readByte();
                    short referenceIndex = dataInputStream.readShort();
                    cpInfo = CONSTANT_MethodHandle.builder().referenceKind(referenceKind).referenceIndex(referenceIndex).build();
                    break;
                case CpInfo.CONSTANT_MethodType:
                    short descriptorIndexMT = dataInputStream.readShort();
                    cpInfo = CONSTANT_MethodType.builder().descriptorIndex(descriptorIndexMT).build();
                    break;
                case CpInfo.CONSTANT_InvokeDynamic:
                    short bootStrapMethodIndex = dataInputStream.readShort();
                    short nameAndTypeId = dataInputStream.readShort();
                    cpInfo = CONSTANT_InvokeDynamic.builder().bootstrapMethodAttrIndex(bootStrapMethodIndex).nameAndTypeIndex(nameAndTypeId).build();
                    break;
                default:
            }
            cpInfo.setTag(oneByte);
            cpInfos[i] = cpInfo;
        }
        return cpInfos;
    }
}
