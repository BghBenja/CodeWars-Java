package com.codecool.kyu6kata;

import java.util.Arrays;

public class StopGinninpsMySdrow {
    public String mineSpinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                String word = "";
                for (int j = 0; j < words[i].length(); j++){
                    word = words[i].charAt(j) + word;
                }
                words[i] = word;
            }
        }
        return String.join(" ", words);
    }

    public String bestSpinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
