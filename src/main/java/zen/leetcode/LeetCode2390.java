package zen.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：从字符串中移除星号
 * 链接： https://leetcode.cn/problems/removing-stars-from-a-string/
 * 状态：AC
 * 标签：栈，字符串
 */
public class LeetCode2390 {

    public String removeStars(String s) {
        final Deque<Character> characters = new ArrayDeque<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            final char ch = s.charAt(i);
            if (ch == '*') characters.pop();
            else characters.push(ch);
        }
        final StringBuilder sb = new StringBuilder();
        for (;;) {
            if (characters.isEmpty()) break;
            sb.append(characters.pollLast());
        }
        return sb.toString();
    }
}
