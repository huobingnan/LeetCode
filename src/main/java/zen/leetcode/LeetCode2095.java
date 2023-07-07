package zen.leetcode;

import zen.leetcode.infra.ListNode;

/**
 * 题目：删除链表的中间节点
 * 链接：https://leetcode.cn/problems/delete-the-middle-node-of-a-linked-list/
 * 状态：AC
 * 标签：链表，快慢指针
 */
public class LeetCode2095 {

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode prev = null, fast = head, slow = head;
        int k = 2;
        for (;;) {
            if (fast == null) break;
            fast = fast.next;
            k--;
            if (k == 0) {
                prev = slow;
                slow = slow.next;
                k = 2;
            }
        }
        prev.next = slow.next;
        return head;
    }
}
