package com.johnsmith.javacore.leetcode;

public class Leetcode1417 {
    public static void main(String[] args) {
        System.out.println(Leetcode1417.reformat("a0b1c2"));
    }

    public static String reformat(String str) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits.append(str.charAt(i));
            } else {
                letters.append(str.charAt(i));
            }
        }

        int lettersLength = letters.length();
        int digitsLength = digits.length();
        if (lettersLength - digitsLength >= 2 || digitsLength - lettersLength >= 2) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int minLength = Math.min(lettersLength, digitsLength);
        for (int i = 0; i < minLength; i++) {
            result.append(letters.charAt(i));
            result.append(digits.charAt(i));
        }

        if (lettersLength > digitsLength) {
            result.append(letters.charAt(minLength));
        }

        if (digitsLength > lettersLength) {
            result.insert(0, digits.charAt(minLength));
        }

        return result.toString();
    }
}
