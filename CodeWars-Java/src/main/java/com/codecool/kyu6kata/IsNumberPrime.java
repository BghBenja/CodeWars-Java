package com.codecool.kyu6kata;

public class IsNumberPrime {
    public static boolean mineIsPrime(int num){
        if (num == 2){
            return true;
        }
        int primeFlag = 0;
        if (num > 1){
            for (int i = 2; i < Math.sqrt(num) + 1; i++){
                if (num % i == 0){
                    primeFlag = 1;
                    break;
                }
            }
            if (primeFlag == 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean bestIsPrime(int number){
        if(number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
