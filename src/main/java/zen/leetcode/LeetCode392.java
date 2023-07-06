package zen.leetcode;

/**
 * 题目：判断子序列
 * 链接：https://leetcode.cn/problems/is-subsequence
 * 状态：AC
 * 标签：双指针
 */
public class LeetCode392 {

    public boolean isSubsequence(String s, String t) {
        int sc = 0, tc = 0;
        final int sl = s.length();
        final int tl = t.length();
        for (;;) {
            if (sc >= sl || tc >= tl) break;
            if (t.charAt(tc) != s.charAt(sc)) {
                tc++;
            } else {
                sc++; tc++;
            }
        }
        return sc == sl;
    }
}
