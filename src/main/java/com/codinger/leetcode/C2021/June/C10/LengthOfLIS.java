package com.codinger.leetcode.C2021.June.C10;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2021/06/10.
 *
 * @author wangrongjia
 */
public class LengthOfLIS {
    public static void main(String[] args) {


        /**
         * 			执行耗时:69 ms,击败了75.89% 的Java用户
         * 			内存消耗:38 MB,击败了73.34% 的Java用户
         */
        int[] nums = {0,1,0,3,2,3};
        int[] result = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            dp(i, nums, result);
        }
        System.out.println(Arrays.toString(result));
        int max = 0;
        for (int i = 0; i < result.length; i++) {
            max = Math.max(max, result[i]);
        }
        System.out.println(max);
    }

    public static void dp(int i, int[] nums, int[] result) {
        if (i == 0) {
            result[i] = 1;
            return;
        }
        int maxBefore = 0;
        for (int j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                maxBefore = Math.max(maxBefore, result[j]);
            }
        }
        result[i] = maxBefore + 1;
    }

}
