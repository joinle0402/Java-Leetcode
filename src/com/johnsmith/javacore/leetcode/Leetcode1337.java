package com.johnsmith.javacore.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1337 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Leetcode1337.kWeakestRows(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        }, 3)));
    }

    public static int[] kWeakestRows(int[][] matrix, int k) {
        Map<Integer, Boolean> markedMap = new HashMap<>();
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        int[] result = new int[k];
        int resultIndex = 0;

        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
                if (markedMap.containsKey(rowIndex)) {
                    continue;
                }

                if (matrix[rowIndex][columnIndex] == 0) {
                    markedMap.put(rowIndex, true);
                    result[resultIndex++] = rowIndex;
                    if (resultIndex == k) {
                        return result;
                    }
                }
            }
        }

        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
            if (markedMap.containsKey(rowIndex)) {
                continue;
            }

            result[resultIndex++] = rowIndex;
            if (resultIndex == k) {
                return result;
            }
        }

        return result;
    }
}
