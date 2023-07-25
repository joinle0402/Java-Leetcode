package com.johnsmith.javacore.leetcode;

public class Leetcode1370 {


    public static void main(String[] args) {
        System.out.println(Leetcode1370.sortString("aaaabbbbcccc"));
        System.out.println(Leetcode1370.sortString("rat"));
    }

    public static String sortString(String str) {
        int length = str.length();
        int[] counts = new int[26];
        for (int i = 0; i < length; i++) {
            counts[str.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        while (length > 0) {
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > 0) {
                    result.append((char) (i + 'a'));
                    counts[i]--;
                    length--;
                }
            }

            for (int i = counts.length - 1; i > 0; i--) {
                if (counts[i] > 0) {
                    result.append((char) (i + 'a'));
                    counts[i]--;
                    length--;
                }
            }
        }

        return result.toString();
    }
}
