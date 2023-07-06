package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode7Test {
    final LeetCode7 instance = new LeetCode7();

    @Test
    public void testCase1() {
        Assertions.assertEquals(321, instance.reverse(123));
        Assertions.assertEquals(-321, instance.reverse(-123));
        Assertions.assertEquals(21, instance.reverse(120));
        Assertions.assertEquals(0, instance.reverse(0));
    }
}
