package com.lxw.javap.util;

import com.lxw.javap.model.CpInfo;

import java.util.function.Function;

public class StringUtils {
    public static String arraysToString(Object[] objects, String separator, boolean addIdx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            if(addIdx) {
                sb.append(String.format("idx:%d | ", i + 1));
            }
            sb.append(objects[i] == null?"":objects[i].toString()).append(separator);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String arraysToString(Object[] objects, String separator, boolean addIdx, Function<Object, String> toString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            if(addIdx) {
                sb.append(String.format("idx:%d | ", i + 1));
            }
            sb.append(objects[i] == null?"":toString.apply(objects[i])).append(separator);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String fastSpaceString(int spaceNumber) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < spaceNumber;i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
