package com.johnsmith.javacore.leetcode;

public class Leetcode1342 {
    public static void main(String[] args) {
        System.out.println(Leetcode1342.numberOfSteps(12));
    }

    public static int numberOfSteps(int number) {
        int result = 1;

        while (number > 0) {
            number = (number % 2 == 0) ? number / 2 : number - 1;
            result++;
        }

        return result;
    }
}
