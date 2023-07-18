package com.johnsmith.javacore.leetcode;

public class Leetcode1385 {
    public static void main(String[] args) {
        System.out.println(Leetcode1385.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
    }

    public static int findTheDistanceValue(int[] arrayOne, int[] arrayTwo, int distance) {
        int restAnswer = 0;

        for (int elementOne : arrayOne) {
            for (int elementTwo : arrayTwo) {
                if (Math.abs(elementOne - elementTwo) <= distance) {
                    restAnswer++;
                    break;
                }
            }
        }
        
        return arrayOne.length - restAnswer;
    }
}
