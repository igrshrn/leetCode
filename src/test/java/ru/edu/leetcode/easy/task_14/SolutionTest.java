package ru.edu.leetcode.easy.task_14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test() {
        assertEquals("fl", solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
    }

    @Test
    void testNoCommonPrefix() {
        String str = "Hello world";
        int pos = str.indexOf("l");
        System.out.println(pos);
        assertEquals("", solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
    }
}
