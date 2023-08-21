package com.johnsmith.javacore.leetcode;

public class Leetcode1266 {
    public static void main(String[] args) {
        System.out.println(Leetcode1266.minTimeToVisitAllPoints(new int[][]{
                {1,1}, {3,4}, {-1,0}
        }));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int distanceX = Math.abs(points[i][0] - points[i + 1][0]);
            int distanceY = Math.abs(points[i][1] - points[i + 1][1]);
            result += Math.max(distanceX, distanceY);
        }
        return result;
    }
}
