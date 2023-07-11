package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode215Test {

    final LeetCode215 instance = new LeetCode215();

    @Test
    public void test() {
        Assertions.assertEquals(
                5,
                instance.findKthLargest(new int[]{3,2,1,5,6,4}, 2),
                "#1"
        );

        Assertions.assertEquals(
                4,
                instance.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4),
                "#2"
        );
    }
}
