package com.xiaoshan.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadInputStream() {
	}

	@Test
	public void testReadString() {
	}

	@Test
	public void testReadFile() throws IOException {
		List<String> list = StreamUtil.read(new File("d:\\pic\\data.txt"));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
