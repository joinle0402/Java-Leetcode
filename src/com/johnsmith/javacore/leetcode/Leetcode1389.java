package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1389 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1389.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
    }

    public static int[] createTargetArray(int[] numbers, int[] indexes) {
        ArrayList<Integer> array = new ArrayList<>();
        int[] result = new int[numbers.length];

        for (int i = 0; i < indexes.length; i++) {
            array.add(indexes[i], numbers[i]);
        }

        for (int i = 0; i < indexes.length; i++) {
            result[i] = array.get(i);
        }

        return result;
    }
}
