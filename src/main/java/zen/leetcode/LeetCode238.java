package zen.leetcode;

import java.util.Arrays;

/**
 * 题目：除自身以外数组的乘积
 * 链接：https://leetcode.cn/problems/product-of-array-except-self/
 * 状态：AC
 * 标签：前缀🐔，后缀🐔
 */
public class LeetCode238 {

    // 计算整个数组中元素的乘积，使用除法求解问题
    public int[] solution(int[] nums) {
        final int[] r = new int[nums.length];
        // 求数组nums的前缀🐔
        r[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            r[i] = r[i-1] * nums[i-1];
        }
        // 求解nums数组的后缀🐔
        int p = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            p = nums[i+1] * p;
            r[i] *= p;
        }
        return r;
    }
}
