package com.johnsmith.javacore.leetcode;

import java.util.Objects;

public class Leetcode1332 {
    public static void main(String[] args) {
        System.out.println(Leetcode1332.removePalindromeSub("ababa"));
        System.out.println(Leetcode1332.removePalindromeSub("abb"));
        System.out.println(Leetcode1332.removePalindromeSub("baabb"));
    }

    public static int removePalindromeSub(String str) {
        if (str.trim().length() == 0) return 0;
        return isPalindromeString(str) ? 1 : 2;
    }

    public static boolean isPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
