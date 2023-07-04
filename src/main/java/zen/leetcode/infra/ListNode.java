package zen.leetcode.infra;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... nums) {
        final ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        for (int i = 0; i < nums.length-1; i++) {
            ptr.next = new ListNode(nums[i]);
            ptr = ptr.next;
        }
        ptr.next = new ListNode(nums[nums.length-1]);
        return dummy.next;
    }

    public List<Integer> toList() {
        final List<Integer> r = new ArrayList<>();
        ListNode ptr = this;
        for (;;) {
            if (ptr == null) break;
            r.add(ptr.val);
            ptr = ptr.next;
        }
        return r;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "[", "]");
        ListNode ptr = this;
        for (;;) {
            if (ptr == null) break;
            sj.add(Integer.toString(ptr.val));
            ptr = ptr.next;
        }
        return sj.toString();
    }
}
