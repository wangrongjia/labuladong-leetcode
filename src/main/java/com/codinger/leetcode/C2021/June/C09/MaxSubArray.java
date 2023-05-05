package com.codinger.leetcode.C2021.June.C09;

import java.util.Arrays;

/**
 * Created on 2021/06/09.
 *
 * @author wangrongjia
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {2, -1, 3, 5};

        /**
         *
         * 			解答成功:
         * 			执行耗时:1 ms,击败了95.47% 的Java用户
         * 			内存消耗:38.3 MB,击败了71.88% 的Java用户
         */
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp(i, nums, result);
        }
        int max = result[0];
        for (int i: result) {
            max = Math.max(i, max);
        }
        System.out.println(max);
    }

    public static void dp(int i, int[] nums, int[] result) {
        if (i == 0) {
            result[i] = nums[i];
            return;
        }
        result[i] = nums[i] + (Math.max(result[i - 1], 0));
    }
}
