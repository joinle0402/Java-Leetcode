package com.johnsmith.javacore.leetcode;

public class Leetcode1323 {
    public static void main(String[] args) {
        System.out.println(Leetcode1323.maximum69Number(9669));
    }

    public static int maximum69Number (int number) {
        char[] numberChars = Integer.toString(number).toCharArray();
        for (int i = 0; i < numberChars.length; i++) {
            if (numberChars[i] == '6') {
                numberChars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(numberChars));
    }
}
