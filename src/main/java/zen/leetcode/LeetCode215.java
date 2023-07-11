package zen.leetcode;

import java.util.PriorityQueue;

/**
 * 题目：数组中的第K个最大元素
 * 链接：https://leetcode.cn/problems/kth-largest-element-in-an-array/
 * 状态： AC
 * 标签：小顶堆，TOP-K
 */
public class LeetCode215 {

    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> heap = new PriorityQueue<>(Integer::compare);
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (heap.size() < k) heap.add(num);
            else {
                final int top = heap.peek();
                if (num > top) {
                    heap.poll();
                    heap.add(num);
                }
            }
        }
        return heap.poll();
    }
}
