package zen.leetcode;

import zen.leetcode.infra.ListNode;

/**
 * 题目：反转链表
 * 链接：https://leetcode.cn/problems/reverse-linked-list/
 * 状态：AC
 * 标签：链表，递归
 */
public class LeetCode206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null, cur = head, next = null;
        for (;;) {
            if (cur == null) break;
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
