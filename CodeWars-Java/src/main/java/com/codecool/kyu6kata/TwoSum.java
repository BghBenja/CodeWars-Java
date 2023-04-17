package com.codecool.kyu6kata;

public class TwoSum {
    public static int[] mineTwoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < i + 1; j++){
                if (numbers[i] + numbers[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] bestTwoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
