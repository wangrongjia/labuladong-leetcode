package com.codinger.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetcodeApplicationTests {

	@Test
	void contextLoads() {
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
