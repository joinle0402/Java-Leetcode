package com.johnsmith.javacore.leetcode;

public class Leetcode1486 {
    public static void main(String[] args) {
        Leetcode1486 leetcode1486 = new Leetcode1486();
        System.out.println(leetcode1486.xorOperation(5, 0));
    }
    public int xorOperation(int n, int start) {
        int result = start;

        for (int i = 1; i < n; i++) {
            result ^= start + 2 * i;
        }

        return result;
    }
}
