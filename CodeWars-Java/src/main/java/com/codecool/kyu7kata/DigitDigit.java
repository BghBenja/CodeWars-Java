package com.codecool.kyu7kata;

import java.util.stream.Collectors;

public class DigitDigit {
    public int mineSquareDigits(int n){
        String[] digits = String.valueOf(n).split("");
        String result = "";
        for (int i = 0; i < digits.length; i++){
            int digit = Integer.parseInt(digits[i]);
            result = result + String.valueOf(digit * digit);
        }
        return Integer.parseInt(result);
    }

    public int bestSquareDigits(int n){
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
