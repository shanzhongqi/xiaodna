package com.xiaoshan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest2 {

	@Test
	public void testIsHttpUrl() {
		boolean b = StringUtil.isHttpUrl("http://127.0.0.1/articleDetail?id=19");
		System.out.println(b);
	}

}
