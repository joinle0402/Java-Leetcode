package com.johnsmith.javacore.leetcode;

public class Leetcode1446 {
    public static void main(String[] args) {
        System.out.println(Leetcode1446.maxPower("leetcode"));
        System.out.println(Leetcode1446.maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        int result = 1;

        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                count = 1;
            }

            if (result < count) {
                result = count;
            }
        }

        return result;
    }
}
