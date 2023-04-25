package com.codecool.kyu6kata;

public class FindTheOddInt {
    public static int mineFindIt(int[] a) {
        int odd = 0;
        for (int i: a) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    count += 1;
                }
            }
            if (count % 2 != 0) {
                odd = i;
                break;
            }
        }
        return odd;
    }

    public static int bestFindIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
