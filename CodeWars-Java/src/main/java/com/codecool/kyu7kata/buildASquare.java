package com.codecool.kyu7kata;

public class buildASquare {
    public static final String mineGenerateShape(int n){
        String[] result = new String[n];
        for (int i = 0; i < n; i++){
            result[i] = "+".repeat(n);
        }
        return String.join("\n", result);
    }

    public static final String bestGenerateShape(int n){
        return ("+".repeat(n) + "\n").repeat(n).trim();
    }
}
