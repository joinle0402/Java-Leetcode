package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1207 {
    public static void main(String[] args) {
        System.out.println(Leetcode1207.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    public static boolean uniqueOccurrences(int[] numbers) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int number : numbers) {
            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            } else {
                occurrences.put(number, 1);
            }
        }
        Map<Integer, Boolean> markedMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            markedMap.put(entry.getValue(), true);
        }
        return markedMap.size() == occurrences.size();
    }
}
