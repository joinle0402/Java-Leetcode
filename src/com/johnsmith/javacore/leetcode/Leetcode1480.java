package com.johnsmith.javacore.leetcode;

import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        Leetcode1480 leetcode1480 = new Leetcode1480();
        System.out.println(Arrays.toString(leetcode1480.runningSum(new int[] {1,2,3,4})));
    }
    public int[] runningSum(int[] numbers) {
        int[] result = new int[numbers.length];
        result[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result[i] = result[i - 1] + numbers[i];
        }
        return result;
    }
}
