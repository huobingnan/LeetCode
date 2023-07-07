package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zen.leetcode.infra.ListNode;

public class LeetCode2095Test {
    final LeetCode2095 instance = new LeetCode2095();

    @Test
    public void test() {
        Assertions.assertEquals(
                ListNode.of(1,3,4,1,2,6),
                instance.deleteMiddle(ListNode.of(1,3,4,7,1,2,6)),
                "Case 1"
        );
        Assertions.assertEquals(
                ListNode.of(1, 2, 4),
                instance.deleteMiddle(ListNode.of(1, 2, 3, 4)),
                "Case 3"
        );
        Assertions.assertEquals(
                ListNode.of(2),
                instance.deleteMiddle(ListNode.of(2,1 )),
                "Case 3"
        );
    }
}
