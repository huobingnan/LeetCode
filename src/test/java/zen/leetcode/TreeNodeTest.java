package zen.leetcode;

import org.junit.jupiter.api.Test;
import zen.leetcode.infra.TreeNode;

import java.util.List;

public class TreeNodeTest {
    @Test
    public void testLevelOrderConstruction() {
        final TreeNode root = TreeNode.fromLevelOrderSequence(3, 9, 20, null, null, 15, 17);
        final List<Integer> seq = TreeNode.levelOrderSequence(root, true);
        System.out.println(seq);
    }
}
