package ru.edu.leetcode.medium.task_24;

import ru.edu.leetcode.utils.ListNode.ListNode;

/**
 * 24. Swap Nodes in Pairs https://leetcode.com/problems/swap-nodes-in-pairs/description/
 * Эффективность: O(n). Константная память: O(1)
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            ListNode first = cur;
            ListNode second = cur.next;
            ListNode nextPair = second.next;

            pre.next = second;
            second.next = first;
            first.next = nextPair;

            pre = first;
            cur = nextPair;
        }

        return dummy.next;
    }
}
