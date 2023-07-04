package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode151Test {
    final LeetCode151 instance = new LeetCode151();

    @Test
    public void testCase1() {
        final String r = instance.reverseWords("the sky is blue");
        Assertions.assertEquals(r, "blue is sky the");
    }

    @Test
    public void testCase2() {
        final String r = instance.reverseWords("  hello world  ");
        Assertions.assertEquals(r, "world hello");
    }

    @Test
    public void testCase3() {
        final String r = instance.reverseWords("a good   example");
        Assertions.assertEquals(r, "example good a");
    }
}
