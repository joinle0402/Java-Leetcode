package com.johnsmith.javacore.leetcode;

public class Leetcode1450 {
    public static void main(String[] args) {
        System.out.println(Leetcode1450.busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
        System.out.println(Leetcode1450.busyStudent(new int[]{4}, new int[]{4}, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                result++;
            }
        }

        return result;
    }
}
