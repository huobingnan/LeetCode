package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zen.leetcode.infra.ListNode;

public class LeetCode328Test {
    final LeetCode328 instance = new LeetCode328();

    @Test
    public void test() {
        Assertions.assertEquals(
                ListNode.of(1, 3, 5, 2, 4),
                instance.oddEvenList(ListNode.of(1, 2, 3, 4, 5)),
                "Case 1"
        );

        Assertions.assertEquals(
                ListNode.of(2,3,6,7,1,5,4),
                instance.oddEvenList(ListNode.of(2,1,3,5,6,4,7)),
                "Case 2"
        );
    }
}
