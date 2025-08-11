package ru.edu.leetcode.easy.task_27;

/** 27. Remove Element https://leetcode.com/problems/remove-element/description/ */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
