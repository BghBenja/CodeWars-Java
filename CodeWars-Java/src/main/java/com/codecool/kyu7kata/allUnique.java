package com.codecool.kyu7kata;

import java.util.*;

public class allUnique {
    public static boolean mineHasUniqueChars(String str){
        Set<String> s = new HashSet<String>();
        for (int i = 0; i < str.length(); i++){
            s.add(String.valueOf(str.charAt(i)));
        }
        return str.length() == s.size();
    }

    public static boolean bestHasUniqueChars(String s){
        return s.chars().distinct().count() == s.length();
    }
}
