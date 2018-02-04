package com.lxw.javap.model.accessflags;

public class ClassAccessFlags {
    public static final int ACC_PUBLIC = 0x0001;
    public static final int ACC_FINAL = 0x0010;
    public static final int ACC_SUPER = 0x0020;
    public static final int ACC_INTERFACE = 0x0200;
    public static final int ACC_ABSTRACT = 0x0400;
    public static final int ACC_SYNTHETIC = 0x1000;
    public static final int ACC_ANNOTATION = 0x2000;
    public static final int ACC_ENUM = 0x4000;

    public static String outputAccessFlags(short accessFlags) {
        StringBuilder sb = new StringBuilder();
        if((accessFlags & ACC_PUBLIC) == ACC_PUBLIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_PUBLIC");
        }
        if((accessFlags & ACC_FINAL) == ACC_FINAL) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_FINAL");
        }
        if((accessFlags & ACC_SUPER) == ACC_SUPER) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_SUPER");
        }
        if((accessFlags & ACC_INTERFACE) == ACC_INTERFACE) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_INTERFACE");
        }
        if((accessFlags & ACC_ABSTRACT) == ACC_ABSTRACT) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_ABSTRACT");
        }
        if((accessFlags & ACC_SYNTHETIC) == ACC_SYNTHETIC) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_SYNTHETIC");
        }
        if((accessFlags & ACC_ANNOTATION) == ACC_ANNOTATION) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("ACC_ANNOTATION");
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
