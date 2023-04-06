package com.codecool.kyu6kata;

public class PlayingWithDigits {

    public static long mineDigPow(int n, int p){
        String[] digits = String.valueOf(n).split("");
        int result = 0;
        for (int i = 0; i < digits.length; i++){
            result += Math.pow(Integer.parseInt(digits[i]), p + i);
        }
        return result % n == 0 ? result / n : -1;
    }

    public static long bestDigPow(int n, int p){
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p){
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        }
        return (sum % n == 0) ? sum / n : 1;
    }
}
