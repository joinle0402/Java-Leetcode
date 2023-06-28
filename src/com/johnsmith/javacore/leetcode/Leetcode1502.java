package com.johnsmith.javacore.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1502 {
    public static void main(String[] args) {
        Leetcode1502 leetcode1502 = new Leetcode1502();
        System.out.println(leetcode1502.canMakeArithmeticProgression2(new int[]{3, 5, 1}));
    }

    public boolean canMakeArithmeticProgression2(int[] array) {
        Arrays.sort(array);

        int length = array.length;
        int step = array[1] - array[0];
        for (int i = 2; i < length; i++) {
            if (array[i] - array[i - 1] != step) {
                return false;
            }
        }

        return true;
    }
    public boolean canMakeArithmeticProgression(int[] array) {
        int min = array[0];
        int max = array[0];
        Map<Integer, Boolean> elementExistMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];
            elementExistMap.put(array[i], true);
        }

        if ((max - min) % (array.length - 1) != 0) return false;

        int step = (max - min) / (array.length - 1);
        int number = min;
        while (number < max) {
            number += step;
            if (!elementExistMap.containsKey(number)) {
                return false;
            }
        }

        return true;
    }
}
