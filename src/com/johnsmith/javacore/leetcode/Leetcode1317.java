package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1317 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1317.getNoZeroIntegers(2)));
    }

    public static int[] getNoZeroIntegers(int number) {
        int i = 1;
        int j = number - 1;

        while (isZeroInteger(i) || isZeroInteger(j)) {
            i++;
            j--;
        }

        return new int[]{i, j};
    }

    public static boolean isZeroInteger(int number) {
        while (number > 10) {
            if (number % 10 == 0) {
                return true;
            }
            number = number / 10;
        }
        return number != 10;
    }
}
