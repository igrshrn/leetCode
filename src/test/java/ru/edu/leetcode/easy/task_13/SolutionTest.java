package ru.edu.leetcode.easy.task_13;

import org.junit.jupiter.api.Test;
import ru.edu.leetcode.easy.task_13.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testDigitNumber3() {
        assertEquals(3, solution.romanToInt("III"));
        ;
    }

    @Test
    void testEdgeCases() {
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }

    @Test
    void testRepeatedSymbols() {
        assertEquals(2, solution.romanToInt("II"));
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(20, solution.romanToInt("XX"));
        assertEquals(200, solution.romanToInt("CC"));
        assertEquals(2000, solution.romanToInt("MM"));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(40, solution.romanToInt("XL"));
        assertEquals(90, solution.romanToInt("XC"));
        assertEquals(400, solution.romanToInt("CD"));
        assertEquals(900, solution.romanToInt("CM"));
    }

    @Test
    void testComplexNumbers() {
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(1476, solution.romanToInt("MCDLXXVI"));
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }

    @Test
    void testCombinations() {
        assertEquals(6, solution.romanToInt("VI"));
        assertEquals(11, solution.romanToInt("XI"));
        assertEquals(15, solution.romanToInt("XV"));
        assertEquals(16, solution.romanToInt("XVI"));
        assertEquals(14, solution.romanToInt("XIV"));
        assertEquals(19, solution.romanToInt("XIX"));
    }

    @Test
    void testCombinations2() {
        assertEquals(6, solution.romanToInt("VI"));
    }
}