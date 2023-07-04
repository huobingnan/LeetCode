package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode605Test {

    final LeetCode605 instance = new LeetCode605();

    @Test
    public void testCase1() {
        final boolean r = instance.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);
        Assertions.assertTrue(r);
    }

    @Test
    public void testCase2() {
        final boolean r = instance.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);
        Assertions.assertFalse(r);
    }
}
