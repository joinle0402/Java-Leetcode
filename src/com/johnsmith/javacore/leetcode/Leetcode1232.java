package com.johnsmith.javacore.leetcode;

public class Leetcode1232 {
    public static void main(String[] args) {

    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }

        int xGap = coordinates[1][0] - coordinates[0][0];
        int yGap = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int xGapI = coordinates[i][0] - coordinates[0][0];
            int yGapI = coordinates[i][1] - coordinates[0][1];

            if (xGap * yGapI != yGap * xGapI) {
                return false;
            }
        }
        return true;
    }
}
