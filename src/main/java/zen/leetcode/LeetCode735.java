package zen.leetcode;

import java.util.*;

/**
 * 题目： 行星碰撞
 * 链接：https://leetcode.cn/problems/asteroid-collision/
 * 状态：AC
 * 标签：栈
 */
public class LeetCode735 {

    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids == null || asteroids.length <= 1) return asteroids;
        final Deque<Integer> stack = new ArrayDeque<>();
        stack.push(asteroids[0]);
        for (int i = 1; i < asteroids.length; ) {
            final int ans = stack.isEmpty() ? 0 : stack.peek();
            final int cur = asteroids[i];
            if (ans > 0 && cur < 0) {
                // -> <- 相向而行
                if (Math.abs(cur) > ans) stack.pop();
                else if (Math.abs(cur) == ans) {
                    stack.pop(); i++;
                } else i++;
            } else {
                stack.push(asteroids[i]);
                i++;
            }
        }
        final int[] r = new int[stack.size()];
        for (int i = 0, len = stack.size(); i < len; i++) {
            r[i] = stack.pollLast();
        }
        return r;
    }
}
