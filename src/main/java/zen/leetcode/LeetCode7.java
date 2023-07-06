package zen.leetcode;

/**
 * 题目：整数反转
 * 链接：https://leetcode.cn/problems/reverse-integer/
 * 状态：AC
 */
public class LeetCode7 {

    public int reverse(int x) {
        final int sign = Integer.signum(x);
        x = Math.abs(x);
        int reverse = 0;
        for (;;) {
            if (x == 0) break;
            try {
                reverse = Math.multiplyExact(reverse, 10);
                reverse = Math.addExact(reverse, x % 10);
            }catch (Exception ex) { return 0; }
            x /= 10;
        }
        return reverse * sign;
    }
}
