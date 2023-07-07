package zen.leetcode;

import zen.leetcode.infra.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：链表最大孪生和
 * 链接：https://leetcode.cn/problems/maximum-twin-sum-of-a-linked-list/
 * 状态：AC
 * 标签：链表，栈
 */
public class LeetCode2130 {
    public int pairSum(ListNode head) {
        final Deque<Integer> stack = new ArrayDeque<>();
        int n = 0;
        ListNode ptr = head;
        for (;ptr != null;) {
            n++;
            ptr = ptr.next;
        }
        ptr = head;
        int idx = 1, half = n / 2, max = Integer.MIN_VALUE;
        for (;;) {
            if (ptr == null) break;
            if (idx > half) {
                final int sum = ptr.val + stack.pop();
                if (sum > max) max = sum;
            } else {
                stack.push(ptr.val);
                idx++;
            }
            ptr = ptr.next;
        }
        return max;
    }
}
