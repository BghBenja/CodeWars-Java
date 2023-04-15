package com.codecool.kyu6kata;

public class DoesMyNumberLookBigInThis {

    public static boolean mineIsNarcisstic(int number){
        String digits = String.valueOf(number);
        int len = digits.length();
        int result = 0;
        for (int i = 0; i < len; i++){
            result += Math.pow((int)digits.charAt(i)-48, len);
        }
        return result == number;
    }

    public static boolean bestIsNarcisstic(int number){
        String strNumber = String.valueOf(number);
        char[] digits = strNumber.toCharArray();
        int sum = 0;
        for (char digit : digits){
            sum += Math.pow(Integer.parseInt(String.valueOf(digit)), digits.length);
        }
        return sum == number ? true : false;
    }
}
