package zen.leetcode.infra;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 从层序遍历序列恢复二叉树
     * @param values 二叉树的层序遍历序列
     * @return 恢复后的二叉树
     */
    public static TreeNode fromLevelOrderSequence(Integer... values) {
        final Deque<TreeNode> candidateNodes = new LinkedList<>();
        for (int i = 0; i < values.length; i++) {
            final Integer value = values[i];
            if (value == null) candidateNodes.offer(null);
            else candidateNodes.offer(new TreeNode(value));
        }
        boolean left = true;
        TreeNode root = null;
        final Deque<TreeNode> visited = new ArrayDeque<>();
        for (;;) {
            if (candidateNodes.isEmpty()) break;
            final TreeNode node = candidateNodes.poll();
            if (node != null) visited.offer(node);
            if (root == null) {
                root = node;
            } else {
                if (left) {
                    visited.peek().left = node;
                    left = !left;
                } else {
                    visited.poll().right = node;
                    left = !left;
                }
            }
        }
        return root;
    }

    public static List<Integer> levelOrderSequence(TreeNode root, boolean resolveNull) {
        final List<Integer> sequence = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        List<TreeNode> nextLevel = new ArrayList<>();
        level.add(root);
        for (;;) {
            int nonNullCount = 0;
            for (final TreeNode node : level) {
                if (node != null) {
                    sequence.add(node.val);
                    // 扩展当前结点
                    if (node.left != null) nonNullCount++;
                    if (node.right != null) nonNullCount++;
                    nextLevel.add(node.left); nextLevel.add(node.right);
                } else {
                    nextLevel.add(null); nextLevel.add(null);
                    sequence.add(null);
                }
            }
            if (nonNullCount == 0) break;
            level.clear();
            final List<TreeNode> levelCpy = level;
            level = nextLevel;
            nextLevel = levelCpy;
        }
        return sequence;
    }
}
