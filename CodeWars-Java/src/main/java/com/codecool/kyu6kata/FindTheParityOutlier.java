package com.codecool.kyu6kata;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheParityOutlier {

    static int mineFind(int[] integers){
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < integers.length; i++){
            if (integers[i] % 2 == 0){
                evens.add(integers[i]);
            }
            else {
                odds.add(integers[i]);
            }
        }
        return odds.size() < evens.size() ? odds.get(0) : evens.get(0);
    }

    public static int bestFind(int[] integers){
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel().filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
