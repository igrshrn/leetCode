package ru.edu.leetcode.easy.task_27;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int removed = solution.removeElement(nums, val);

        assertEquals(2, removed);
        assertArrayEquals(new int[] {2, 2}, Arrays.copyOfRange(nums, 0, removed));
    }

    @Test
    void testCase2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int removed = solution.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        assertEquals(5, removed);
        assertArrayEquals(new int[] {0, 1, 3, 0, 4}, Arrays.copyOfRange(nums, 0, removed));
    }
}
