package ru.edu.leetcode.easy.task_9;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x % 10 == 0 && x != 0) return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed == original;
    }
}
