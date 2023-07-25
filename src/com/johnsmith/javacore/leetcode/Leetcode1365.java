package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1365.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }

    public static int[] smallerNumbersThanCurrent(int[] numbers) {
        int[] results = new int[numbers.length];
        int[] digitArray = new int[101];

        for (int number : numbers) {
            digitArray[number]++;
        }

        for (int i = 1; i < 101; i++) {
            digitArray[i] = digitArray[i] + digitArray[i - 1];
        }

        for (int i = 0; i < numbers.length; i++) {
            results[i] = (numbers[i] == 0) ? 0 : digitArray[numbers[i] - 1];
        }

        return results;
    }
}
