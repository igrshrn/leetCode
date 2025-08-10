package ru.edu.leetcode.medium.task_61;

import ru.edu.leetcode.utils.ListNode.ListNode;

/** 61. Rotate List https://leetcode.com/problems/rotate-list/description/ */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Находим длину списка и хвост
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Вычисляем эффективное число поворотов
        k = k % length;
        if (k == 0) {
            return head;
        }

        // Находим новый хвост
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Выполняем поворот
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}
