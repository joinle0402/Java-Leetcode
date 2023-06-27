package com.johnsmith.javacore.leetcode;

public class Leetcode1528 {
    public static void main(String[] args) {
        Leetcode1528 leetcode1528 = new Leetcode1528();
        System.out.println(leetcode1528.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    public String restoreString(String str, int[] indices) {
        char[] result = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = str.charAt(i);
        }

        return new String(result);
    }
}
