package com.johnsmith.javacore.leetcode;

public class Leetcode1351 {
    public static void main(String[] args) {
        System.out.println(Leetcode1351.countNegatives(new int[][]{
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        }));
    }

    public static int countNegatives(int[][] grid) {
        int counter = 0;
        int endIndex = grid[0].length - 1;

        for (int[] row : grid) {
            int firstNegativeIndex = binarySearch(row, endIndex);
            if (firstNegativeIndex != -1) {
                counter += row.length - firstNegativeIndex;
                endIndex = firstNegativeIndex;
            }
        }

        return counter;
    }

    public static int binarySearch(int[] array, int endIndex) {
        int startIndex = 0;
        while (true) {
            if (startIndex == endIndex) {
                if (array[endIndex] < 0) {
                    return endIndex;
                } else {
                    return -1;
                }
            }

            int middleIndex = (startIndex + endIndex) / 2;
            if (array[middleIndex] < 0) {
                endIndex = middleIndex;
            } else {
                startIndex = middleIndex + 1;
            }
        }
    }
}
