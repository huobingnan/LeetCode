package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode2679Test {
    final LeetCode2679 instance = new LeetCode2679();

    @Test
    public void testCase1() {
        final int r = instance.matrixSum(new int[][] {
                {7, 2, 1},
                {6, 4, 2},
                {6, 5, 3},
                {3, 2, 1}
        });
        Assertions.assertEquals(15, r);
    }

    @Test
    public void testCase2() {
        final int r = instance.matrixSumSorted(new int[][] {
                {7, 2, 1},
                {6, 4, 2},
                {6, 5, 3},
                {3, 2, 1}
        });
        Assertions.assertEquals(15, r);
    }
}
