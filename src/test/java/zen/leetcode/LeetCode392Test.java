package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode392Test {
    final LeetCode392 instance = new LeetCode392();

    @Test
    public void testCase1() {
        Assertions.assertTrue(instance.isSubsequence("abc", "ahbgdc"));
        Assertions.assertFalse(instance.isSubsequence("axc", "ahbgdc"));
    }
}
