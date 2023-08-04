package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1304.sumZero(5)));
        System.out.println(Arrays.toString(Leetcode1304.sumZero(10)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];

        for (int i = 0; i < result.length / 2; i++) {
            result[2 * i] = i + 1;
            result[2 * i + 1] = -(i + 1);
        }

        return result;
    }
}
