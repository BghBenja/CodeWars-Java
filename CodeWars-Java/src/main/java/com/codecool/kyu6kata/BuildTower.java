package com.codecool.kyu6kata;

public class BuildTower {
    public static String[] mineTowerBuilder(int nFloors){
        String[] result = new String[nFloors];
        for (int i = 0; i < result.length; i++){
            String floor = " ".repeat(nFloors - (i + 1)) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - (i + 1));
            result[i] = floor;
        }
        return result;
    }

    public static String[] bestTowerBuilder(int n){
        String t[] = new String[n], e;

        for (int i = 0; i < n; i++)
            t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;

        return t;
    }
}
