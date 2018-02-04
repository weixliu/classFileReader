package com.lxw.javap.util;

public class StringUtils {
    public static String arrysToString(Object[] objects, char separator, boolean addIdx) {
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
}
