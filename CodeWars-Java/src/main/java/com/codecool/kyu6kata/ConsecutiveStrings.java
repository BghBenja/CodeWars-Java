package com.codecool.kyu6kata;

public class ConsecutiveStrings {
    public static String mineLongestConsec(String[] strarr, int k) {
        String result = "";

        if (k > 0 && strarr.length >= k){
            for (int i = 0; i < strarr.length - k + 1; i++){
                String s = "";
                for (int j = 0; j < k; j++){
                    s += strarr[i + j];
                }
                if (s.length() > result.length()){
                    result = s;
                }
            }
        }
        return result;
    }

    public static String bestLongestConsec(String[] strarr, int k) {
        if(strarr.length == 0 || k > strarr.length || k <= 0) return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++){
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++){
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()){
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}
