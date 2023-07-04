package zen.leetcode;

import zen.leetcode.infra.TreeNode;

import java.util.*;

/**
 * 题目：二叉树的最大宽度
 * 链接：https://leetcode.cn/problems/maximum-width-of-binary-tree
 * 状态： AC
 * 备注： 二叉树广度优先遍历的新方式（能够记录每层结点的信息）
 */
public class LeetCode662 {

    public int widthOfBinaryTree(TreeNode root) {
        List<Object[]> array = new ArrayList<>();
        array.add(new Object[]{root, 1});
        int maxWidth = 1;
        for (;;) {
            if (array.isEmpty()) break;
            final Object[] first = array.get(0);
            final Object[] last = array.get(array.size()-1);
            final int width = (int) last[1] - (int) first[1] + 1;
            maxWidth = Math.max(width, maxWidth);
            // 记录下一层结点的信息
            final List<Object[]> temp = new ArrayList<>();
            // 扩展上一层的所有结点
            for (int i = 0, len = array.size(); i < len; i++) {
                final Object[] pair = array.get(i);
                final TreeNode p = (TreeNode) pair[0];
                final int number = (int) pair[1];
                if (p.left != null) temp.add(new Object[]{ p.left, number << 1 });
                if (p.right != null) temp.add(new Object[]{ p.right, (number << 1)+1 });
            }
            array = temp;
        }
        return maxWidth;
    }
}
