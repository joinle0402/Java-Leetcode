package com.johnsmith.javacore.leetcode;

public class Leetcode1464 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] { 3,4,5,2 }));
    }

    public static int maxProduct(int[] numbers) {
        int firstMax = 0;
        int secondMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secondMax = firstMax;
                firstMax = numbers[i];
            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];
            }
        }
        return (firstMax - 1) * (secondMax - 1);
    }
}
