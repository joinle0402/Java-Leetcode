package com.johnsmith.javacore.leetcode;

public class Leetcode1460 {
    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
    }

    public static boolean canBeEqual(int[] target, int[] array) {
        int sumOfTarget = 0, sumOfArray = 0, productOfTarget = 1, productOfArray = 1;
        for (int i = 0; i < target.length; i++) {
            sumOfTarget += target[i];
            sumOfArray += array[i];
            productOfTarget *= target[i];
            productOfArray *= array[i];
        }
        return (sumOfTarget == sumOfArray) && (productOfTarget == productOfArray);
    }
}
