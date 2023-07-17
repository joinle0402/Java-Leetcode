package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Leetcode1394 {
    public static void main(String[] args) {
        System.out.println(Leetcode1394.findLucky(new int[]{2, 2, 3, 4}));
    }

    public static int findLucky(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : array) {
            frequencyMap.put(number, frequencyMap.containsKey(number) ? frequencyMap.get(number) + 1 : 1);
        }

        int result = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue())) {
                if (result < entry.getValue()) {
                    result = entry.getValue();
                }
            }
        }
        return result;
    }
}
