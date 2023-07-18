package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1380 {
    public static void main(String[] args) {
        System.out.println(Leetcode1380.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            countMap.put(min, countMap.containsKey(min) ? countMap.get(min) + 1 : 1);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 1; j < matrix.length; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            countMap.put(max, countMap.containsKey(max) ? countMap.get(max) + 1 : 1);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() != 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
