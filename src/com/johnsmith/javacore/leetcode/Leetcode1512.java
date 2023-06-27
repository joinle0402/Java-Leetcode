package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1512 {
    public static void main(String[] args) {
        Leetcode1512 leetcode1512 = new Leetcode1512();
        System.out.println(leetcode1512.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(leetcode1512.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }

    public int numIdenticalPairs(int[] numbers) {
        int result = 0;
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int number : numbers) {
            if (!counterMap.containsKey(number)) {
                counterMap.put(number, 1);
            } else {
                result += counterMap.get(number);
                counterMap.put(number, counterMap.get(number) + 1);
            }
        }
        return result;
    }
}
