package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode238Test {
    final LeetCode238 instance = new LeetCode238();

    @Test
    public void testCase1() {
        final int[] r = instance.solution(new int[]{1, 2, 3, 4});
        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, r);
    }
}
