package com.lxw.javap.model;

import lombok.Getter;
import lombok.Setter;

public class CpInfo {
    public static final int CONSTANT_Class = 7;
    public static final int CONSTANT_Fieldref = 9;
    public static final int CONSTANT_Methodref = 10;
    public static final int CONSTANT_InterfaceMethodref = 11;
    public static final int CONSTANT_String = 8;
    public static final int CONSTANT_Integer = 3;
    public static final int CONSTANT_Float = 4;
    public static final int CONSTANT_Long = 5;
    public static final int CONSTANT_Double = 6;
    public static final int CONSTANT_NameAndType = 12;
    public static final int CONSTANT_Utf8 = 1;
    public static final int CONSTANT_MethodHandle = 15;
    public static final int CONSTANT_MethodType = 16;
    public static final int CONSTANT_InvokeDynamic = 18;
    @Setter
    @Getter
    protected byte tag;

    public static String tag2String(byte tag) {
        int iTag = tag;
        switch (iTag) {
            case CONSTANT_Class:
                return "CONSTANT_Class";
            case CONSTANT_Fieldref:
                return "CONSTANT_Fieldref";
            case CONSTANT_Methodref:
                return "CONSTANT_Methodref";
            case CONSTANT_InterfaceMethodref:
                return "CONSTANT_InterfaceMethodref";
            case CONSTANT_String:
                return "CONSTANT_String";
            case CONSTANT_Integer:
                return "CONSTANT_Integer";
            case CONSTANT_Float:
                return "CONSTANT_Float";
            case CONSTANT_Long:
                return "CONSTANT_Long";
            case CONSTANT_Double:
                return "CONSTANT_Double";
            case CONSTANT_NameAndType:
                return "CONSTANT_NameAndType";
            case CONSTANT_Utf8:
                return "CONSTANT_Utf8";
            case CONSTANT_MethodHandle:
                return "CONSTANT_MethodHandle";
            case CONSTANT_MethodType:
                return "CONSTANT_MethodType";
            case CONSTANT_InvokeDynamic:
                return "CONSTANT_InvokeDynamic";
            default:
                return "";
        }
    }
}
