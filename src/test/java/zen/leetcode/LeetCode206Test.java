package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zen.leetcode.infra.ListNode;

public class LeetCode206Test {

    final LeetCode206 instance = new LeetCode206();

    @Test
    public void test() {
        Assertions.assertEquals(
                ListNode.of(5, 4, 3, 2, 1),
                instance.reverseList(ListNode.of(1, 2, 3, 4, 5)),
                "Case 1"
        );

        Assertions.assertEquals(
                ListNode.of(2, 1),
                ListNode.of(1, 2),
                "Case 2"
        );

        Assertions.assertEquals(
                null,
                instance.reverseList(null),
                "Case 3"
        );

    }
}
