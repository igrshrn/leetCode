package ru.edu.leetcode.easy.task_20;

import org.junit.jupiter.api.Test;
import ru.edu.leetcode.easy.task_20.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testSimpleValidPair() {
        assertTrue(solution.isValid("{}"));
    }

    @Test
    void testMultipleValidPairs() {
        assertTrue(solution.isValid("{}[]()"));
        assertTrue(solution.isValid2("{[]}[]()"));
        assertTrue(solution.isValid2("[[[[[[[]]]]]]]"));
    }

    @Test
    void testInvalidPair() {
        assertFalse(solution.isValid("{]"));
    }

    @Test
    void test2SimpleValidPair() {
        assertTrue(solution.isValid2("{}"));
    }

    @Test
    void test2MultipleValidPairs() {
        assertTrue(solution.isValid("{}[]()"));
        assertTrue(solution.isValid2("{[]}[]()"));
        assertTrue(solution.isValid2("[[[[[[[]]]]]]]"));
    }

    @Test
    void test2InvalidPair() {
        assertFalse(solution.isValid2("{]"));
    }
}