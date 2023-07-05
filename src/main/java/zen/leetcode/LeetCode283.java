package zen.leetcode;

import java.util.Arrays;

/**
 * 题目：移动零
 * 链接：https://leetcode.cn/problems/move-zeroes/
 * 状态：AC
 */
public class LeetCode283 {

    public void solution(int[] nums) {
        // 1. 删除nums数组中的0
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) k++;
            else nums[i-k] = nums[i];
        }
        // 2. 在数组的末尾填充0
        Arrays.fill(nums, nums.length-k, nums.length, 0);
    }
}
