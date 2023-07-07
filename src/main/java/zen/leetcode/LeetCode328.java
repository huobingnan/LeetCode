package zen.leetcode;

import zen.leetcode.infra.ListNode;

/**
 * 题目：奇偶链表
 * 链接：https://leetcode.cn/problems/odd-even-linked-list/
 * 状态：AC
 * 标签：链表
 */
public class LeetCode328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        final ListNode oddDummy = new ListNode(0);
        final ListNode evenDummy = new ListNode(0);

        ListNode op = head, ep = head.next;
        oddDummy.next = op;
        evenDummy.next = ep;
        int idx = 3; head = head.next.next;
        // 断链
        op.next = null; ep.next = null;
        for (;;) {
            if (head == null) break;
            final ListNode next = head.next;
            head.next = null;
            if (idx % 2 != 0) {
                // 奇数索引节点
                op.next = head;
                op = op.next;
            } else {
                // 偶数索引节点
                ep.next = head;
                ep = ep.next;
            }
            head = next;
            idx++;
        }
        op.next = evenDummy.next;
        return oddDummy.next;
    }
}
