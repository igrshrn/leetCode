package ru.edu.leetcode.medium.task_39;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 3), List.of(7));
        List<List<Integer>> result = solution.combinationSum(candidates, target);

        assertTrue(compareLists(expected, result));
    }

    @Test
    void testCase2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> expected =
                Arrays.asList(
                        Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5));
        List<List<Integer>> result = solution.combinationSum(candidates, target);

        assertTrue(compareLists(expected, result));
    }

    @Test
    void testCase3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> expected = List.of();
        List<List<Integer>> result = solution.combinationSum(candidates, target);

        assertTrue(compareLists(expected, result));
    }

    private boolean compareLists(List<List<Integer>> expected, List<List<Integer>> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        for (List<Integer> list : expected) {
            if (!actual.contains(list)) {
                return false;
            }
        }
        return true;
    }
}
