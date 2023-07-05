package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode283Test {
    final LeetCode283 instance = new LeetCode283();

    @Test
    public void testCase1() {
        final int[] nums = {0, 1, 0, 3, 12};
        instance.solution(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}
