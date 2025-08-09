package ru.edu.leetcode.medium.task_5;

/**
 * 5. Longest Palindromic Substring https://leetcode.com/problems/longest-palindromic-substring/
 * Используем алгоритм расширения вокруг центра каждого символа, суть в том, что каждый символ
 * рассматривается как потенциальный центр палиндрома. Эффективность: O(n²) Константная память: O(1)
 */
public class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Для нечетного палиндрома
            int len1 = expandAroundCenter(s, i, i);
            // Для четного палиндрома
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * Вычисляем длину для заданного центра
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
