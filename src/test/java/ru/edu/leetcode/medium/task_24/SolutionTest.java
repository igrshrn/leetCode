package ru.edu.leetcode.medium.task_24;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import ru.edu.leetcode.utils.ListNode.ListNode;
import ru.edu.leetcode.utils.ListNode.ListNodeHelper;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1() {
        ListNode head = ListNodeHelper.createList(1, 2, 3, 4);
        ListNode result = solution.swapPairs(head);

        assertArrayEquals(new int[] {2, 1, 4, 3}, ListNodeHelper.listToArray(result));
    }

    @Test
    void testCase2() {
        ListNode head = ListNodeHelper.createList();
        ListNode result = solution.swapPairs(head);

        assertArrayEquals(new int[] {}, ListNodeHelper.listToArray(result));
    }

    @Test
    void testCase3() {
        ListNode head = ListNodeHelper.createList(1);
        ListNode result = solution.swapPairs(head);

        assertArrayEquals(new int[] {1}, ListNodeHelper.listToArray(result));
    }

    @Test
    void testCase4() {
        ListNode head = ListNodeHelper.createList(1, 2, 3);
        ListNode result = solution.swapPairs(head);

        assertArrayEquals(new int[] {2, 1, 3}, ListNodeHelper.listToArray(result));
    }
}
