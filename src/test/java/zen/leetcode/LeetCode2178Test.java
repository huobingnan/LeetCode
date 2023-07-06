package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class LeetCode2178Test {
    final LeetCode2178 instance = new LeetCode2178();

    @Test
    public void testCase1() {
        final List<Long> r = instance.maximumEvenSplit(12);
        Assertions.assertEquals(Arrays.asList(2L, 4L, 6L),  r);
    }

    @Test
    public void testCase2() {
        final List<Long> r = instance.maximumEvenSplit(7);
        Assertions.assertEquals(Collections.<Long>emptyList(), r);
    }

    @Test
    public void testCase3() {
        final List<Long> r = instance.maximumEvenSplit(28);
        Assertions.assertEquals(new TreeSet<>(Arrays.asList(16L, 6L, 2L, 4L)),  new TreeSet<>(r));
    }
}
