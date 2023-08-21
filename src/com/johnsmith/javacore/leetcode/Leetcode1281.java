package com.johnsmith.javacore.leetcode;

public class Leetcode1281 {
    public static void main(String[] args) {
        System.out.println(Leetcode1281.subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int lastDigit;

        while (number != 0) {
            lastDigit = number % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            productOfDigits = productOfDigits * lastDigit;
            number = number / 10;
        }

        return sumOfDigits - productOfDigits;
    }
}
