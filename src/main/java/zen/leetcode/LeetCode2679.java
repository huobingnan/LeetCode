package zen.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * 题目：矩阵中的和
 * 链接：https://leetcode.cn/problems/sum-in-a-matrix/
 * 状态：NOT AC
 * 标签：小顶堆
 */
public class LeetCode2679 {

    public int matrixSum(int[][] nums) {
        final PriorityQueue<Integer>[] rowHeaps = new PriorityQueue[nums.length];
        for (int i = 0; i < rowHeaps.length; i++) rowHeaps[i] = new PriorityQueue<>((a, b) -> b-a);
        for (int i = 0; i < nums.length; i++) {
            final int[] row = nums[i];
            final PriorityQueue<Integer> rowHeap = rowHeaps[i];
            for (int j = 0; j < row.length; j++) {
                rowHeap.add(row[j]);
            }
        }
        int score = 0;
        loop:
        for (;;) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                final PriorityQueue<Integer> rowHeap = rowHeaps[i];
                if (rowHeap.isEmpty()) break loop;
                final int value = rowHeap.poll();
                if (value > max) max = value;
            }
            score += max;
        }
        return score;
    }

    // 通过排序的方式解决
    public int matrixSumSorted(int[][] nums) {
        // 将每一行数据都排好序
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
        final int rowNumber = nums.length;
        final int colNumber = nums[0].length;
        int score = 0;
        // 寻找每一列的最大值
        for (int j = colNumber-1; j >= 0; j--) {
            int max = 0;
            for (int i = 0; i < rowNumber; i++) {
                final int value = nums[i][j];
                if (value > max) max = value;
            }
            score += max;
        }
        return score;
    }
}
