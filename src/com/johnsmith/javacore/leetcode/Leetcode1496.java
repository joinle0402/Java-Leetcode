package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1496 {
    public static void main(String[] args) {
        Leetcode1496 leetcode1496 = new Leetcode1496();
        System.out.println(leetcode1496.isPathCrossing("NES"));
        System.out.println(leetcode1496.isPathCrossing("NES"));
    }
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Map<String, Boolean> visitedMap = new HashMap<>();
        String rootPoint = String.format("(%d, %d)", x, y);
        visitedMap.put(rootPoint, true);

        for (int i = 0; i < path.length(); i++) {
            char directive = path.charAt(i);
            switch (directive) {
                case 'N':
                    y = y + 1;
                    break;
                case 'S':
                    y = y - 1;
                    break;
                case 'E':
                    x = x + 1;
                    break;
                case 'W':
                    x = x - 1;
                    break;
            }
            String point = String.format("(%d, %d)", x, y);
            if (visitedMap.containsKey(point)) return true;
            visitedMap.put(point, true);
        }

        return false;
    }
}
