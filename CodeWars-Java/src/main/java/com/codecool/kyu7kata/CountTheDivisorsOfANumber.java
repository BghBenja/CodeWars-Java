package com.codecool.kyu7kata;

public class CountTheDivisorsOfANumber {
    public long mineNumberOfDivisors(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0) result++;
        }
        return result;
    }

    public long bestnNmberOfDivisors(int n) {
        long counter = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                counter++;
            }
        }
        return counter;
    }
}
