package zen.leetcode.infra;

import org.junit.jupiter.api.Test;

public class ListNodeTest {

    @Test
    public void testMethodOf() {
        final ListNode list = ListNode.of(1, 2, 3, 4, 5, 6);
        System.out.println(list);
    }
}
