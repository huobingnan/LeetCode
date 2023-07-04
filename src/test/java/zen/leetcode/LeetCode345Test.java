package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode345Test {
    final LeetCode345 instance = new LeetCode345();

    @Test
    public void testCase1() {
        final String r = instance.reverseVowels("hello");
        Assertions.assertEquals(r, "holle");
    }

    @Test
    public void testCase2() {
        final String r = instance.reverseVowels("leetcode");
        Assertions.assertEquals(r, "leotcede");
    }


    @Test
    public void dualPtrTestCase1() {
        final String r = instance.reverseVowelsDualPtr("hello");
        Assertions.assertEquals(r, "holle");
    }

    @Test
    public void dualPtrTestCase2() {
        final String r = instance.reverseVowelsDualPtr("leetcode");
        Assertions.assertEquals(r, "leotcede");
    }
}
