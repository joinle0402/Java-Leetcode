package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7}, 3)));
    }

    public static int[] shuffle(int[] numbers, int n) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < n; i++) {
            result[2 * i] = numbers[i];
            result[2 * i + 1] = numbers[i + n];
        }

        return result;
    }
}
