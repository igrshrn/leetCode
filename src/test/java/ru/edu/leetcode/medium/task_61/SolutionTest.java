package ru.edu.leetcode.medium.task_61;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import ru.edu.leetcode.utils.ListNode.ListNode;
import ru.edu.leetcode.utils.ListNode.ListNodeHelper;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1() {
        ListNode head = ListNodeHelper.createList(1, 2, 3, 4, 5);
        ListNode result = solution.rotateRight(head, 2);

        assertArrayEquals(new int[] {4, 5, 1, 2, 3}, ListNodeHelper.listToArray(result));
    }

    @Test
    void testCase2() {
        ListNode head = ListNodeHelper.createList(0, 1, 2);

        ListNode result = solution.rotateRight(head, 4);
        assertArrayEquals(new int[] {2, 0, 1}, ListNodeHelper.listToArray(result));
    }
}
