package com.jyt.onlinesharepicturebackend;



import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    private static final Map<Long, Set<String>> pictureSessions = new ConcurrentHashMap<>();
    public static  void main(String[] args) {
        f();
    }
    public static void f() {
        Set<String> set = new HashSet<>();
        set.add("jyt");
        set.add("xm");
        set.add("xl");
        pictureSessions.put(1L,set);
        System.out.println(pictureSessions.toString());
        Set<String> strings = pictureSessions.get(1L);
        strings.remove("xl");
        System.out.println(pictureSessions.toString());

    }
}
