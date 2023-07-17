package com.johnsmith.javacore.leetcode;

public class Leetcode1422 {
    public static void main(String[] args) {
        System.out.println(Leetcode1422.maxScore("011101"));
        System.out.println(Leetcode1422.maxScore("00111"));
    }

    public static int maxScore(String str) {
        int rightScore = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                rightScore++;
            }
        }

        int result = 0;
        int leftScore = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '1') {
                rightScore--;
            } else {
                leftScore++;
            }

            if (result < leftScore + rightScore) {
                result = leftScore + rightScore;
            }
        }

        return result;
    }
}
