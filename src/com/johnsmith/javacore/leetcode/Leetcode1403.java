package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1403 {
    public static void main(String[] args) {
        System.out.println(Leetcode1403.minSubsequence(new int[] {4,3,10,9,8}));
    }

    public static List<Integer> minSubsequence(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }

        int sum = 0;
        Arrays.sort(numbers);
        List<Integer> result = new ArrayList<>();
        for (int i = numbers.length - 1; i >= 0; i--) {
            result.add(numbers[i]);
            sum += numbers[i];
            if (sum > totalSum - sum) {
                return result;
            }
        }

        return result;
    }
}
