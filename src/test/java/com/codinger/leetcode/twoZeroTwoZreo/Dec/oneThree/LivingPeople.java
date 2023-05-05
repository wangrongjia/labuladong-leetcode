package com.codinger.leetcode.twoZeroTwoZreo.Dec.oneThree;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *面试题 16.10 生存人数
 */
@SpringBootTest
public class LivingPeople {

    @Test
    void test() {
        int[] birth = {1972,1908,1915,1957,1960,1948,1912,1903,1949,1977,1900,1957,1934,1929,1913,1902,1903,1901};
        int[] death = {1997,1932,1963,1997,1983,2000,1926,1962,1955,1997,1998,1989,1992,1975,1940,1903,1983,1969};
        System.out.println(maxAliveYear(birth, death));
    }

    public int maxAliveYear(int[] birth, int[] death) {
        // birth year <= curYear <= death year
        int maxLivingYear = 1900;
        int maxLivingPeople = 0;
        for (int curYear = 1900; curYear <= 2000; curYear++) {
            int cnt = 0;
            for (int j = 0; j < birth.length; j++) {
                if (birth[j]<=curYear && curYear<=death[j] ) {
                    cnt++;
                }
            }
            if (cnt > maxLivingPeople) {
                maxLivingPeople = cnt;
                maxLivingYear = curYear;
            }
        }
        return maxLivingYear;
    }
}
