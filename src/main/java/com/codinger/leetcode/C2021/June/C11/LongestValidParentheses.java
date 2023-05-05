package com.codinger.leetcode.C2021.June.C11;

import java.util.Arrays;

/**
 * Created on 2021/06/11.
 *
 * @author wangrongjia
 */
public class LongestValidParentheses {
    public static void main(String[] args) {
        /**
         * 			执行耗时:1 ms,击败了100.00% 的Java用户
         * 			内存消耗:38.3 MB,击败了77.53% 的Java用户
         */
        String s = "()";
        char[] chars = s.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            dp(i, chars, result);
        }
        System.out.println(Arrays.toString(result));
        int max = 0;
        for (int i = 0; i < result.length; i++) {
            max = Math.max(max, result[i]);
        }
        System.out.println(max);
    }

    private static void dp(int i, char[] chars, int[] result) {
        // 单个括号无法成对
        if (i == 0) {
            result[i] = 0;
            return;
        }
        // 结尾必须是）
        if ('(' == (chars[i])) {
            result[i] = 0;
            return;
        }

        if (chars[i - 1] == '(') {
            // 前一位是(，后两位成对
            if (i - 2 >= 0) {
                result[i] = result[i - 2] + 2;
            } else {
                result[i] = 2;
            }
        } else {
            // 前一位是) 后两位不成对
            if (i - result[i - 1] - 1 >= 0) {
                if (chars[i - result[i - 1] - 1] == '(') {
                    if (i - result[i - 1] - 2 >= 0) {
                        result[i] = result[i - 1] + result[i - result[i - 1] - 2] + 2;
                    } else {
                        result[i] = result[i - 1] + 2;
                    }
                } else {
                    result[i] = 0;
                }
            }
        }
    }


}
