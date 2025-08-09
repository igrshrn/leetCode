package ru.edu.leetcode.easy.task_13;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < prev) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prev = currentValue;
        }

        return result;
    }
}
