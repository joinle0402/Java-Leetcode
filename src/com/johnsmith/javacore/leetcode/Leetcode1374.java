package com.johnsmith.javacore.leetcode;

public class Leetcode1374 {
    public static void main(String[] args) {
        System.out.println(Leetcode1374.generateTheString(4));
    }

    public static String generateTheString(int n) {
        return (n % 2 != 0) ? "a".repeat(n) : "a".repeat(n - 1) + "b";
    }
}
