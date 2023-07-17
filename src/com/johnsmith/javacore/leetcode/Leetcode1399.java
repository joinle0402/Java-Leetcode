package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1399 {
    public static void main(String[] args) {
        System.out.println(Leetcode1399.countLargestGroup(13));
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> group = new HashMap<>();

        int result = 0;
        int maxCount = 0;
        for (int number = 1; number <= n; number++) {
            int sumOfDigits = getSumOfDigits(number);
            int value = group.containsKey(sumOfDigits) ? group.get(sumOfDigits) + 1 : 1;
            group.put(sumOfDigits, value);
            if (value == maxCount) {
                result++;
            } else if (value > maxCount) {
                result = 1;
                maxCount = value;
            }
        }

        group.forEach((key, value) -> System.out.println(key + " => " + value));
        return result;
    }

    public static int getSumOfDigits(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }
}
