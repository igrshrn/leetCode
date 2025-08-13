package ru.edu.leetcode.easy.task_35;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] nums = new int[] {1, 3, 5, 6};
        int target = 5;
        int k = solution.searchInsert(nums, target);

        assertEquals(k, 2);
    }

    @Test
    void testCase2() {
        int[] nums = new int[] {1, 3, 5, 6};
        int target = 2;
        int k = solution.searchInsert(nums, target);

        assertEquals(k, 1);
    }

    @Test
    void testCase3() {
        int[] nums = new int[] {1, 3, 5, 6};
        int target = 7;
        int k = solution.searchInsert(nums, target);

        assertEquals(k, 4);
    }
}
