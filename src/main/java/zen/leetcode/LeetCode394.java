package zen.leetcode;

/**
 * 题目：字符串解码
 * 链接：https://leetcode.cn/problems/decode-string/
 * 状态：AC
 * 标签：字符串，栈，递归
 */
public class LeetCode394 {

    public String solution(String s, int start, int end) {
        final StringBuilder sb = new StringBuilder();
        int repeat = 0, cnt = 0;
        for (int i = start; i <= end; ) {
            final char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                // 解析数字
                repeat *= 10;
                repeat += ch - '0';
                i++;
            } else if (ch == '[') {
                // 解析括号内容
                cnt++;
                int j = i+1;
                for (; j <= end; j++) {
                    if (cnt == 0) break;
                    if (s.charAt(j) == ']') cnt--;
                    if (s.charAt(j) == '[') cnt++;
                }
                final String inner = solution(s, i+1, j-2);
                for (int k = 0; k < repeat; ++k) sb.append(inner);
                repeat = 0; cnt = 0;
                i = j;
            } else {
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }

    public String decodeString(String s) {
        return solution(s, 0, s.length()-1);
    }
}
