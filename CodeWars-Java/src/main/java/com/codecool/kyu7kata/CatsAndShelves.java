package com.codecool.kyu7kata;

public class CatsAndShelves {
    public static int mineSolution(int start, int finnish)
    {
        return (int)((finnish - start) / 3) + ((finnish - start) % 3);
    }

    public static int bestSolution(int start, int finnish)
    {
        int diff = (finnish - start);
        return diff / 3 + diff % 3;
    }
}
