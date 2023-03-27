package com.codecool.kyu7kata;
import java.util.*;

public class Isograms {
    public static boolean  mineIsIsogram(String str) {
        Set<String> hs = new HashSet<String>();
        for (int i = 0; i < str.length(); i++){
            hs.add("" + Character.toLowerCase(str.charAt(i)));
        }
        return str.length() == hs.size();
    }

    public static boolean  bestIsIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
