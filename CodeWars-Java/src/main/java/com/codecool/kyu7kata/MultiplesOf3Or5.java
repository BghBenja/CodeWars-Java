package com.codecool.kyu7kata;

public class MultiplesOf3Or5 {
    public int mineSolution(int number){
        if (number < 0){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < number; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                result = result + i;
            }
        }
        return result;
    }

    public int bestSolution(int number){
        int sum = 0;

        for (int i = 0; i < number; i++){
            if (i%3==0 || i%5==0){sum+=1;}
        }
        return sum;
    }
}
