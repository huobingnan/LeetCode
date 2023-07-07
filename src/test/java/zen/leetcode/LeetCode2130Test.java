package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zen.leetcode.infra.ListNode;

public class LeetCode2130Test {

    final LeetCode2130 instance = new LeetCode2130();

    @Test
    public void test() {
        Assertions.assertEquals(
                6,
                instance.pairSum(ListNode.of(5, 4, 2, 1)),
                "Case 1"
        );
        Assertions.assertEquals(
                7,
                instance.pairSum(ListNode.of(4, 2, 2, 3)),
                "Case 2"
        );
        Assertions.assertEquals(
                100001,
                instance.pairSum(ListNode.of(1, 100000)),
                "Case 3"
        );
    }
}
