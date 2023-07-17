package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1408 {
    public static void main(String[] args) {
        System.out.println(Leetcode1408.stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}
