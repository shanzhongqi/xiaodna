package com.xiaoshan.common.utils;


import org.junit.Test;

public class NumberUtilsTest {

	@Test
	public void testGetPercent() {
		int percent = NumberUtils.getPercent(51, 68);
		System.out.println(percent);
	}

}
