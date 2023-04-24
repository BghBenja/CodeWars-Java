package com.codecool.kyu6kata;

import java.util.*;

public class CountTheSmileyFaces {

    public  static int mineCountSmileys(List<String> arr) {
        System.out.println(arr);
        int count = 0;
        for (int i = 0; i < arr.size(); i++){
            String face = arr.get(i);
            if (face.equals(":)")
                    || face.equals(";)")
                    || face.equals(":D")
                    || face.equals(";D")
                    || face.equals(":-)")
                    || face.equals(";-)")
                    || face.equals(":-D")
                    || face.equals(";-D")
                    || face.equals(":~)")
                    || face.equals(";~)")
                    || face.equals(":~D")
                    || face.equals(";~D")){
                count += 1;
            }
        }
        return count;
    }

    public  static int bestCountSmileys(List<String> arr) {
        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }

}
