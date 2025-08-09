package ru.edu.leetcode.easy.task_20;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/description/
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        char[] stack = new char[s.length()];
        int topIndex = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[topIndex++] = c;
            } else {
                if (topIndex == 0) {
                    return false;
                }

                char top = stack[--topIndex];
                if (!((top == '(' && c == ')') ||
                        (top == '[' && c == ']') ||
                        (top == '{' && c == '}'))) {
                    return false;
                }
            }
        }

        return topIndex == 0;
    }
}
