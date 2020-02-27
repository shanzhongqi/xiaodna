package com.xiaoshan.common.utils;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 102);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] arry = RandomUtil.subRandom(1, 30, 4);
		for (int i : arry) {
			System.out.println(i);
		}
		
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(3);
		System.out.println(string);
	}

}
