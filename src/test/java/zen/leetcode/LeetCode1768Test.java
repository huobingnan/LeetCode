package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode1768Test {

    final LeetCode1768 instance = new LeetCode1768();

    @Test
    public void testCase1() {
        final String w = instance.mergeAlternately("abc", "pqr");
        Assertions.assertEquals(w, "apbqcr");
    }

    @Test
    public void testCase2() {
        final String w = instance.mergeAlternately("ab", "pqrs");
        Assertions.assertEquals(w, "apbqrs");
    }

    @Test
    public void testCase3() {
        final String w = instance.mergeAlternately("abcd", "pq");
        Assertions.assertEquals(w, "apbqcd");
    }
}
