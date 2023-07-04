package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LeetCode648Test {

    final LeetCode648 instance = new LeetCode648();

    @Test
    public void testCase1() {
        final String r = instance.replaceWords(Arrays.asList("cat","bat","rat"), "the cattle was rattled by the battery");
        Assertions.assertEquals(r, "the cat was rat by the bat");
    }

    @Test
    public void testCase2() {
        final String r = instance.replaceWords(Arrays.asList("a", "b", "c"), "aadsfasf absbs bbab cadsfafs");
        Assertions.assertEquals(r, "a a b c");
    }
}
