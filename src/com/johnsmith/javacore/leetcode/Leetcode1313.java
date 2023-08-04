package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1313 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1313.decompressRLElist(new int[]{1, 2, 3, 4})));
    }

    public static int[] decompressRLElist(int[] numbers) {
        int totalElements = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            totalElements += numbers[i];
        }

        int[] result = new int[totalElements];
        int index = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            int frequency = numbers[i];
            int value = numbers[i + 1];
            for (int j = 0; j < frequency; j++) {
                result[index++] = value;
            }
        }


        return result;
    }
}
