package zen.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 题目：反转字符串中的单词
 * 链接：https://leetcode.cn/problems/reverse-words-in-a-string
 * 状态：AC
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        final Deque<String> stack = new ArrayDeque<>();
        Arrays.stream(s.trim().split(" "))
                .filter(it -> it != null && it.length() > 0)
                .forEach(it -> stack.push(it));
        return String.join(" ", stack);
    }
}
