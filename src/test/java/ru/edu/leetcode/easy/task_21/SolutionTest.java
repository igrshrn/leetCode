package ru.edu.leetcode.easy.task_21;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    private Solution.ListNode createList(int... values) {
        Solution.ListNode dummy = new Solution.ListNode(-1);
        Solution.ListNode current = dummy;
        for (int val : values) {
            current.next = new Solution.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    @Test
    void testMergeTwoLists() {
        solution = new Solution();

        Solution.ListNode list1 = createList(1, 2, 4);
        Solution.ListNode list2 = createList(1, 3, 4);
        Solution.ListNode merged = solution.mergeTwoLists(list1, list2);
        assertArrayEquals(new int[] {1, 1, 2, 3, 4, 4}, toArray(merged));
    }

    @Test
    void testMergeTwoNullLists() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    void testMergeFirstEmptySecondWithData() {
        Solution.ListNode list3 = createList(0);
        Solution.ListNode merged3 = solution.mergeTwoLists(null, list3);
        assertArrayEquals(new int[] {0}, toArray(merged3));
    }

    private int[] toArray(Solution.ListNode head) {
        if (head == null) return new int[0];
        int size = 0;
        Solution.ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }
}
