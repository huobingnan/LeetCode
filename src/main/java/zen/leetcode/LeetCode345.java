package zen.leetcode;

import java.util.*;

/**
 * 题目：反转字符串中的元音字母
 * 链接：https://leetcode.cn/problems/reverse-vowels-of-a-string/
 * 状态：AC
 * 标签：栈，双指针
 */
public class LeetCode345 {

    public String reverseVowels(String s) {
        final char[] chars = s.toCharArray();
        final Deque<Character> stack = new ArrayDeque<>();
        final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (int i = 0; i < chars.length; i++) {
            final char ch = chars[i];
            if (vowels.contains(ch)) {
                stack.push(ch);
                chars[i] = (char)-1; // 打标签
            }
        }
        for (int i = 0; i < chars.length; i++) {
            final char ch = chars[i];
            if (ch == (char) -1) {
                chars[i] = stack.pop();
            }
        }
        return new String(chars);
    }

    public String reverseVowelsDualPtr(String s) {
        int left = 0, right = s.length()-1;
        final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        final char[] chars = s.toCharArray();
        for (;;) {
            if (left >= right) break;
            for (;left < right;) {
                if (vowels.contains(chars[left])) break;
                left++;
            }
            for (;right > left;) {
                if (vowels.contains(chars[right])) break;
                right--;
            }
            final char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++; right--;
        }
        return new String(chars);
    }
}
