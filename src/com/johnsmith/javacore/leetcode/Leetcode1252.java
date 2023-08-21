package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1252 {
    public static void main(String[] args) {
        System.out.println(Leetcode1252.oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
    }

    public static void print(String message, int[][] matrix) {
        System.out.println(message);
        for (int[] rows : matrix) {
            System.out.println(Arrays.toString(rows));
        }
    }

    public static int oddCells(int rowSize, int columnSize, int[][] indices) {
        int[] rowCounter = new int[rowSize];
        int[] columnCounter = new int[columnSize];

        for (int[] item : indices) {
            rowCounter[item[0]]++;
            columnCounter[item[1]]++;
        }

        int result = 0;
        for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
                if ((rowCounter[rowIndex] + columnCounter[columnIndex]) % 2 != 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
