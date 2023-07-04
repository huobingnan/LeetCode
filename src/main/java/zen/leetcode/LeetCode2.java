package zen.leetcode;

import zen.leetcode.infra.ListNode;

/**
 * 题目：两数相加
 * 链接：https://leetcode.cn/problems/add-two-numbers/
 * 状态：AC
 */
public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        int carry = 0, l1Val = 0, l2Val = 0;
        for (;;) {
            if (l1 == null && l2 == null) break;

            if (l1 != null) l1Val = l1.val;
            else l1Val = 0;
            if (l2 != null) l2Val = l2.val;
            else l2Val = 0;
            // 带进位求和
            final int bit = l1Val + l2Val + carry;
            ptr.next = new ListNode(bit % 10);
            ptr = ptr.next;
            if (bit >= 10) carry = 1;
            else carry = 0;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        // 处理最高位进位
        if (carry != 0) ptr.next = new ListNode(1);
        return dummy.next;
    }
}
