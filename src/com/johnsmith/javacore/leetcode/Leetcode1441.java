package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1441 {
    public static void main(String[] args) {
        System.out.println(Leetcode1441.buildArray(new int[]{1, 3}, 4));
        System.out.println(Leetcode1441.buildArray(new int[]{1, 2, 3}, 4));
        System.out.println(Leetcode1441.buildArray(new int[]{1, 2}, 4));
    }

    public static List<String> buildArray(int[] target, int maxNumber) {
        List<String> result = new ArrayList<>();

        int index = 0;
        for (int number = 1; number <= target[target.length - 1]; number++) {
            if (target[index] == number) {
                result.add("Push");
                index++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        
        return result;
    }
}
