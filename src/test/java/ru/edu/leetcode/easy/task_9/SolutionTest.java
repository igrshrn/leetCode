package ru.edu.leetcode.easy.task_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void testPositivePalindrome() {
    assertTrue(Solution.isPalindrome(121));
  }

  @Test
  void testLargePalindrome() {
    assertTrue(Solution.isPalindrome(12321));
  }

  @Test
  void testZeroPalindrome() {
    assertTrue(Solution.isPalindrome(0));
  }

  @Test
  void testEndsWithZero() {
    assertFalse(Solution.isPalindrome(10));
  }

  @Test
  void testNonPalindrome() {
    assertFalse(Solution.isPalindrome(12345));
  }

  @Test
  void testSingleDigit() {
    assertTrue(Solution.isPalindrome(7));
  }
}
