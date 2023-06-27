package com.johnsmith.javacore.leetcode;

public class Leetcode1523 {
    public static void main(String[] args) {
        Leetcode1523 leetcode1523 = new Leetcode1523();
        System.out.println(leetcode1523.countOdds(3, 7));
        System.out.println(leetcode1523.countOdds(8, 10));
    }

    public int countOdds(int low, int high) {
        int distance = high - low + 1;

        if (distance % 2 != 0 && high % 2 != 0) {
            return (distance / 2) + 1;
        }

        return distance / 2;
    }
}
