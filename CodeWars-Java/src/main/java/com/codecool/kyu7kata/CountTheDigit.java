package com.codecool.kyu7kata;

public class CountTheDigit {
    public static int mineNbDig(int n, int d)
    {
        int result = 0;
        for (int i = 0; i <= n; i++){
            String current = String.valueOf(i * i);
            for (int j = 0; j < current.length(); j++){
                if (current.charAt(j) == String.valueOf(d).charAt(0)){
                    result ++;
                }
            }
        }
        return result;
    }

    public static int bestNbDig(int n, int d)
    {
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += countOfDigit((int) Math.pow(i, 2), d);
        }
        return sum;
    }

    public static int countOfDigit(int n, int d){
        int count = 0;
        do {
            if (n % 10 == d)
                count ++;
            n /= 10;
        } while (n > 0);
        return count;
    }
}
