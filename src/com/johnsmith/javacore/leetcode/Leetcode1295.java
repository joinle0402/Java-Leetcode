package com.johnsmith.javacore.leetcode;


public class Leetcode1295 {
    public static void main(String[] args) {
        System.out.println(Leetcode1295.findNumbers(new int[]{437, 315, 322, 431, 686, 264, 442}));
    }

    public static int findNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (isEvenNumberOfDigits(number)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isEvenNumberOfDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }

        return counter % 2 == 0;
    }

}
