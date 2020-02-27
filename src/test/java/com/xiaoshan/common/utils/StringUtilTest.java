package com.xiaoshan.common.utils;


import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString();
		System.out.println(randomChineseString);
	}

	@Test
	public void testRandomChineseStringInt() {
		String chineseString = StringUtil.randomChineseString(3);
		System.out.println(chineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
