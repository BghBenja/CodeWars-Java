package com.codecool.kyu6kata;

import java.util.Arrays;

public class ConvertStringToCamelCase {

    static String mineToCamelCase(String s){
        if (s.length() == 0){
            return "";
        }
        String result = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
            char c = s.charAt(i-1);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                result += String.valueOf(s.charAt(i));
            }
            else {
                result += String.valueOf(s.charAt(i)).toUpperCase();
            }
        }
        return result.replaceAll("[_-]", "");
    }

    static String bestToCamelCase(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
}
