package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode2390Test {
    final LeetCode2390 instance = new LeetCode2390();

    @Test
    public void test() {
        Assertions.assertEquals("lecoe", instance.removeStars("leet**cod*e"), "Case 1");
        Assertions.assertEquals("", instance.removeStars("erase*****"), "Case 2");
    }
}
