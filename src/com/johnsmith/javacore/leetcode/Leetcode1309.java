package com.johnsmith.javacore.leetcode;

public class Leetcode1309 {
    public static void main(String[] args) {
        System.out.println(Leetcode1309.freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                int number = Integer.parseInt(str.substring(i - 2, i));
                char value = (char) (number + 'j' - 10);
                result.insert(0, value);
                i = i - 2;
            } else {
                int number = str.charAt(i) - '0';
                char value = (char) (number + 'a' - 1);
                result.insert(0, value);
            }
        }

        return result.toString();
    }
}
