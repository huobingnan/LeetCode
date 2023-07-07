package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode735Test {

    final LeetCode735 instance = new LeetCode735();

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{5, 10},
                instance.asteroidCollision(new int[]{5, 10, -5}), "Case 1");
        Assertions.assertArrayEquals(new int[]{},
                instance.asteroidCollision(new int[]{8, -8}), "Case 2");
        Assertions.assertArrayEquals(new int[]{10},
                instance.asteroidCollision(new int[]{10, 2, -5}), "Case 3");
        Assertions.assertArrayEquals(new int[]{-10},
                instance.asteroidCollision(new int[]{2, 3, 5, -10}), "Case 4");
        Assertions.assertArrayEquals(new int[]{-2, -2, -2},
                instance.asteroidCollision(new int[]{-2, -2, 1, -2}), "Case 5");
    }
}
