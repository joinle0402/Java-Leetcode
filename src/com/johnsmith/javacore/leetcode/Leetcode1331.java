package com.johnsmith.javacore.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1331 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1331.arrayRankTransform(new int[]{40, 10, 20, 30})));
    }

    public static int[] arrayRankTransform(int[] array) {
        int[] result = new int[array.length];
        int[] ascendingArray = Arrays.copyOf(array, array.length);
        Arrays.sort(ascendingArray);
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;

        for (int element : ascendingArray) {
            if (rankMap.containsKey(element)) {
                rankMap.put(element, rank);
            } else {
                rank++;
                rankMap.put(element, rank);
            }
        }


        for (int i = 0; i < result.length; i++) {
            result[i] = rankMap.get(array[i]);
        }

        return result;
    }
}
