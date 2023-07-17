package com.johnsmith.javacore.leetcode;

public class Leetcode1413 {
    public static void main(String[] args) {
        System.out.println(Leetcode1413.minStartValue(new int[]{-3, 2, -3, 4, 2}));
    }

    public static int minStartValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] += numbers[i - 1];
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        return (1 - minValue) <= 0 ? 1 : (1 - minValue);
    }
}
