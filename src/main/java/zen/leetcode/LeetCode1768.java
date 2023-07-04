package zen.leetcode;

/**
 * 题目：交替合并字符串
 * 链接：https://leetcode.cn/problems/merge-strings-alternately/
 * 状态：AC
 */
public class LeetCode1768 {
    public String mergeAlternately(String word1, String word2) {
        final StringBuilder sb = new StringBuilder();
        final int cl = Math.min(word1.length(), word2.length()) << 1;
        int i = 0;
        for (; i < cl; i++) {
            if (i % 2 == 0) {
                // 如果索引位置是偶数则从word1中提取字符
                sb.append(word1.charAt(i >> 1));
            } else {
                // 如果索引位置是奇数则从word2中提取字符
                sb.append(word2.charAt(i >> 1));
            }
        }
        if (word1.length() > cl >> 1) sb.append(word1.substring(cl >> 1));
        if (word2.length() > cl >> 1) sb.append(word2.substring(cl >> 1));
        return sb.toString();
    }
}
