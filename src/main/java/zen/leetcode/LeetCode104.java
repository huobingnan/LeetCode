package zen.leetcode;

import zen.leetcode.infra.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：二叉树的最大深度
 * 链接：https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 * 状态：AC
 * 标签：二叉树，栈，递归
 */
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        final Deque<TreeNode> aux = new ArrayDeque<>();
        // 后根遍历
        TreeNode ptr = root, ans = null;
        for (;ptr != null;) { aux.push(ptr); ptr = ptr.left; }
        int maxDepth = Integer.MIN_VALUE;
        for (;;) {
            if (aux.isEmpty()) break;
            ptr = aux.peek();
            if (ptr.right == null || ptr.right == ans) {
                // 统计结点数量
                maxDepth = Math.max(maxDepth, aux.size());
                ans = aux.pop();
            } else {
                // 拥有右孩子
                ptr = ptr.right;
                for (;ptr != null;) { aux.push(ptr); ptr = ptr.left; }
            }
        }
        return maxDepth;
    }
}
