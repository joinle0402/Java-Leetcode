package com.johnsmith.javacore.leetcode;

public class Leetcode1217 {
    public static void main(String[] args) {
        System.out.println(Leetcode1217.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
    }

    public static int minCostToMoveChips(int[] numbers) {
        int evenCounter = 0;
        for (int number: numbers) {
            if (number % 2 == 0) {
                evenCounter++;
            }
        }
        return Math.max(evenCounter, numbers.length - evenCounter);
    }
}
