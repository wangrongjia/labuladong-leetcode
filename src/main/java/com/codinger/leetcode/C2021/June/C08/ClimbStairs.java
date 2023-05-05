package com.codinger.leetcode.C2021.June.C08;

/**
 * Created on 2021/06/08.
 *
 * @author wangrongjia
 */

public class ClimbStairs {

    public static void main(String[] args) {
        int n = 45;

        /**
         * 		运行失败:
         * 		Time Limit Exceeded
         * 		测试用例:45
         * 		stdout:
         */
//        System.out.println(dp(n));


        /**
         * 		解答成功:
         * 		执行耗时:0 ms,击败了100.00% 的Java用户
         * 		内存消耗:35.2 MB,击败了39.11% 的Java用户
         */
//        int[] temp = new int[n];
//        for (int i = 1; i <= n; i++) {
//            dp1(i, temp);
//        }
//        System.out.println(temp[n - 1]);


        /**
         *
         * 			执行耗时:0 ms,击败了100.00% 的Java用户
         * 			内存消耗:35 MB,击败了85.06% 的Java用户
         */
        int[] cache = new int[2];
        for (int i = 1; i <= n; i++) {
            dp2(i, cache);
        }
        System.out.println(cache[(n - 1) % 2]);
    }

    public static int dp(int i) {
        switch(i) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return dp(i - 1) + dp( i - 2);
        }
    }


    public static void dp1(int i, int[] temp) {
        switch(i) {
            case 1:
                temp[0] = 1;
                break;
            case 2:
                temp[1] = 2;
                break;
            default:
                temp[i - 1] = temp[i - 2] + temp [i - 3];
                break;
        }
    }

    public static void dp2(int i, int[] temp) {
        switch(i) {
            case 1:
                temp[0] = 1;
                break;
            case 2:
                temp[1] = 2;
                break;
            default:
                temp[(i - 1) % 2] = temp[(i - 2) % 2] + temp [(i - 3) % 2];
                break;
        }
    }
}
