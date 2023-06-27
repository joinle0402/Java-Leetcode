package com.johnsmith.javacore.leetcode;

public class Leetcode1518 {

    public static void main(String[] args) {
        Leetcode1518 solution = new Leetcode1518();
        System.out.println("Testcase 1: " + solution.numWaterBottles(9, 3));
        System.out.println("Testcase 2: " + solution.numWaterBottles(15, 4));
    }

    public int numWaterBottles(int numberOfBottles, int numberOfExchange) {
        int result = 0;
        int numberOfEmptyBottles;

        numberOfEmptyBottles = numberOfBottles;
        result += numberOfBottles;

        while (numberOfEmptyBottles >= numberOfExchange) {
            numberOfBottles = numberOfEmptyBottles / numberOfExchange;
            numberOfEmptyBottles = numberOfEmptyBottles % numberOfExchange;

            numberOfEmptyBottles += numberOfBottles;
            result += numberOfBottles;
        }

        return result;
    }

}
