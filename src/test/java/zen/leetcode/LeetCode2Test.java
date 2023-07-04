package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zen.leetcode.infra.ListNode;

import java.util.Arrays;

public class LeetCode2Test {
    final LeetCode2 instance = new LeetCode2();

    @Test
    public void case1() {
        final ListNode l1 = ListNode.of(9, 9, 1);
        final ListNode l2 = ListNode.of(1);
        final ListNode ret = instance.addTwoNumbers(l1, l2);
        Assertions.assertEquals(ret.toList(), Arrays.asList(0, 0, 2));
        System.out.println(ret);
    }
}
