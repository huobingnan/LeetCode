package zen.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题目：拆分成最多数目的正偶数之和
 * 链接：https://leetcode.cn/problems/maximum-split-of-positive-even-integers/
 * 状态：AC
 * 标签：递归，分治，尾递归转迭代循环
 */
public class LeetCode2178 {

    public void solution(List<Long> list, int k, long finalSum) {
        if (finalSum % 2 != 0) return; // 奇数直接返回
        final long first = k << 1;
        final long last = finalSum - first;
        if (last > first) {
            list.add(first);
            solution(list, k+1, last);
        } else {
            list.add(finalSum);
        }
    }

    public List<Long> solution(long finalSum) {
        if (finalSum % 2 != 0) return Collections.emptyList();
        final List<Long> ret = new ArrayList<>();
        for (int k = 1; k < finalSum; k++) {
            final long first = k << 1;
            final long last = finalSum - first;
            if (last > first) {
                ret.add(first);
                finalSum -= first;
            } else {
                ret.add(finalSum);
                break;
            }
        }
        return ret;
    }
    public List<Long> maximumEvenSplit(long finalSum) {
//        final List<Long> r = new ArrayList<>();
//        solution(r, 1, finalSum);
//        return r;
        return solution(finalSum);
    }
}
