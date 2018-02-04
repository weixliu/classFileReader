package com.lxw.javap.model.accessflags;

public class MethodAccessFlags {
    public static final int ACC_PUBLIC = 0x0001;
    public static final int ACC_PRIVATE = 0x0002;
    public static final int ACC_PROTECTED = 0x0004;
    public static final int ACC_STATIC = 0x0008;
    public static final int ACC_FINAL = 0x0010;
    public static final int ACC_SYNCHRONIZED = 0x0020;
    public static final int ACC_BRIDGE = 0x0040;
    public static final int ACC_VARARGS = 0x0080;
    public static final int ACC_NATIVE = 0x0100;
    public static final int ACC_ABSTRACT = 0x0400;
    public static final int ACC_STRICTFP = 0x0800;
    public static final int ACC_SYNTHETIC = 0X1000;

    public static String outputAccessFlags(short accessFlags) {
        StringBuilder sb = new StringBuilder();
        if ((accessFlags & ACC_PUBLIC) == ACC_PUBLIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PUBLIC");
        }
        if ((accessFlags & ACC_PRIVATE) == ACC_PRIVATE) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PRIVATE");
        }
        if ((accessFlags & ACC_PROTECTED) == ACC_PROTECTED) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PROTECTED");
        }
        if ((accessFlags & ACC_STATIC) == ACC_STATIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_STATIC");
        }
        if ((accessFlags & ACC_FINAL) == ACC_FINAL) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_FINAL");
        }
        if ((accessFlags & ACC_SYNCHRONIZED) == ACC_SYNCHRONIZED) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_SYNCHRONIZED");
        }
        if ((accessFlags & ACC_BRIDGE) == ACC_BRIDGE) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_BRIDGE");
        }
        if ((accessFlags & ACC_VARARGS) == ACC_VARARGS) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_VARARGS");
        }
        if ((accessFlags & ACC_NATIVE) == ACC_NATIVE) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_NATIVE");
        }
        if ((accessFlags & ACC_ABSTRACT) == ACC_ABSTRACT) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_ABSTRACT");
        }
        if ((accessFlags & ACC_STRICTFP) == ACC_STRICTFP) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_STRICTFP");
        }
        if ((accessFlags & ACC_SYNTHETIC) == ACC_SYNTHETIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_SYNTHETIC");
        }
        return sb.toString();
    }
}
