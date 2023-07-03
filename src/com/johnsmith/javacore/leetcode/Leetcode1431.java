package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {
    public static void main(String[] args) {
        System.out.println(Leetcode1431.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int maxOfCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (maxOfCandies < candies[i]) {
                maxOfCandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxOfCandies);
        }

        return result;
    }
}
