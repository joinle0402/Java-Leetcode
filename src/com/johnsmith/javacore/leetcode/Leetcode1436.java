package com.johnsmith.javacore.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1436 {
    public static void main(String[] args) {
        List<List<String>> paths = List.of(
                List.of("London","New York"),
                List.of("New York","Lima"),
                List.of("Lima","Sao Paulo")
        );

        System.out.println(Leetcode1436.destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        String result = "";

        Map<String, Boolean> checkExistsMap = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            checkExistsMap.put(paths.get(i).get(0), true);
            checkExistsMap.put(paths.get(i).get(1), checkExistsMap.containsKey(paths.get(i).get(1)) ? checkExistsMap.get(paths.get(i).get(1)) : false);
        }

        for (Map.Entry<String, Boolean> entry : checkExistsMap.entrySet()) {
            if (!entry.getValue()) {
                return entry.getKey();
            }
        }

        return result;
    }
}
