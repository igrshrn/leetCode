package ru.edu.leetcode.easy.task_26;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] nums = {1, 1, 2};
        int k = solution.removeDuplicates(nums);

        assertEquals(2, k);
        assertArrayEquals(new int[] {1, 2}, Arrays.copyOfRange(nums, 0, k));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-5, -5, -3, -3, -1, 0, 0, 0, 2};
        int k = solution.removeDuplicates(nums);

        assertEquals(5, k);
        assertArrayEquals(new int[] {-5, -3, -1, 0, 2}, Arrays.copyOfRange(nums, 0, k));
    }
}
