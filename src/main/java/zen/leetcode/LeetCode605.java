package zen.leetcode;

/**
 * 题目：种花问题
 * 链接：https://leetcode.cn/problems/can-place-flowers
 * 状态：NOT AC
 */
public class LeetCode605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed[0] == 0) {
            if (flowerbed.length > 1 && flowerbed[1] == 0) {

            }
            flowerbed[0] = 1;
            n--;
        }

        for (int i = 1; i < flowerbed.length-1; i++) {
            if (flowerbed[i] == 1) continue;
            if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) {
            flowerbed[flowerbed.length-1] = 1;
            n--;
        }
        return n == 0;
    }
}
