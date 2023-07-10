package zen.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zen.leetcode.infra.TreeNode;

public class LeetCode104Test {
    final LeetCode104 instance = new LeetCode104();

    @Test
    public void test() {
        Assertions.assertEquals(
                3,
                instance.maxDepth(TreeNode.fromLevelOrderSequence(3,9,20,null,null,15,7)),
                "#1"
        );
    }
}
