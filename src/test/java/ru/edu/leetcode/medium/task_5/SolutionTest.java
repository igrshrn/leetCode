package ru.edu.leetcode.medium.task_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1() {
        String result = solution.longestPalindrome("babad");
        System.out.println(result);
        assertTrue(result.equals("bab") || result.equals("aba"));
    }

    @Test
    void testCase2() {
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    void testCase3() {
        assertEquals("ffffffff", solution.longestPalindrome("aaaaabbbfdffffffff"));
    }
}
