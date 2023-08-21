package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1260 {
    public static void main(String[] args) {
//        System.out.println(Leetcode1260.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
        System.out.println(Leetcode1260.shiftGrid(new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23));
    }

    public static List<List<Integer>> shiftGrid(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;

        int[] array = new int[total];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[(i * col + j + k) % total] = matrix[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> rowElements = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                rowElements.add(array[i * col + j]);
            }
            result.add(rowElements);
        }

        return result;
    }
}
