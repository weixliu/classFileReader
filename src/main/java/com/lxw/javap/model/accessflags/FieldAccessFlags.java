package com.lxw.javap.model.accessflags;

public class FieldAccessFlags {
    public static final int ACC_PUBLIC = 0x0001;
    public static final int ACC_PRIVATE = 0x0002;
    public static final int ACC_PROTECTED = 0x0004;
    public static final int ACC_STATIC = 0x0008;
    public static final int ACC_FINAL = 0x0010;
    public static final int ACC_VOLATILE = 0x0040;
    public static final int ACC_TRANSIENT = 0x0080;
    public static final int ACC_SYNTHETIC = 0X1000;
    public static final int ACC_ENUM = 0x4000;

    public static String outputAccessFlags(short accessFlags) {
        StringBuilder sb = new StringBuilder();
        if((accessFlags & ACC_PUBLIC) == ACC_PUBLIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PUBLIC");
        }
        if((accessFlags & ACC_PRIVATE) == ACC_PRIVATE) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PRIVATE");
        }
        if((accessFlags & ACC_PROTECTED) == ACC_PROTECTED) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PROTECTED");
        }
        if((accessFlags & ACC_STATIC) == ACC_STATIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_STATIC");
        }
        if((accessFlags & ACC_FINAL) == ACC_FINAL) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_FINAL");
        }
        if((accessFlags & ACC_VOLATILE) == ACC_VOLATILE) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_VOLATILE");
        }
        if((accessFlags & ACC_TRANSIENT) == ACC_TRANSIENT) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_TRANSIENT");
        }
        if((accessFlags & ACC_SYNTHETIC) == ACC_SYNTHETIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_SYNTHETIC");
        }
        if((accessFlags & ACC_ENUM) == ACC_ENUM) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_ENUM");
        }
        return sb.toString();
    }
}
