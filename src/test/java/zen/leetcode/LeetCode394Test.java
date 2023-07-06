package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode394Test {
    final LeetCode394 instance = new LeetCode394();

    @Test
    public void testCase1() {
        Assertions.assertEquals("aaabcbc", instance.decodeString("3[a]2[bc]"), "测试案例1");
        Assertions.assertEquals("accaccacc", instance.decodeString("3[a2[c]]"), "测试案例2");
        Assertions.assertEquals("abcabccdcdcdef", instance.decodeString("2[abc]3[cd]ef"), "测试案例3");
        Assertions.assertEquals("abccdcdcdxyz", instance.decodeString("abc3[cd]xyz"), "测试案例4");
    }
}
