package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1299 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1299.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

    public static int[] replaceElements(int[] array) {
        int max = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            int element = array[i];
            array[i] = max;
            if (max < element) {
                max = element;
            }
        }
        return array;
    }
}
