package ru.edu.leetcode.medium.task_2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.edu.leetcode.utils.ListNode.ListNodeHelper.listToArray;

import org.junit.jupiter.api.Test;
import ru.edu.leetcode.utils.ListNode.ListNode;
import ru.edu.leetcode.utils.ListNode.ListNodeHelper;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1() {
        ListNode l1 = ListNodeHelper.createList(2, 4, 3);
        ListNode l2 = ListNodeHelper.createList(5, 6, 4);
        ListNode result = solution.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[] {7, 0, 8}, listToArray(result));
    }

    @Test
    void testCase2() {
        ListNode l1 = ListNodeHelper.createList(0);
        ListNode l2 = ListNodeHelper.createList(0);
        ListNode result = solution.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[] {0}, listToArray(result));
    }

    @Test
    void testCase3() {
        ListNode l1 = ListNodeHelper.createList(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = ListNodeHelper.createList(9, 9, 9, 9);
        ListNode result = solution.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[] {8, 9, 9, 9, 0, 0, 0, 1}, listToArray(result));
    }
}
