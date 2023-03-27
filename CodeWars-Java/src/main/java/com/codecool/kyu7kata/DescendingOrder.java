package com.codecool.kyu7kata;
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int mineSortDesc(final int num) {
        System.out.println(num);
        String[] digits = String.valueOf(num).split("");
        Arrays.sort(digits);
        int res = 0;
        for (int i = (digits.length - 1); i >= 0; i--){
            res = res * 10 + Integer.valueOf(digits[i]);
        }
        return res;
    }

    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
