package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1356 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1356.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
    }

    public static int[] sortByBits(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += Integer.bitCount(array[i]) * 10001;
        }

        Arrays.sort(array);


        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]%10001;
        }

        return array;
    }


}
