package com.xiaoshan.common.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机工具类
 * @author: 小单
 * @date: 2020年2月27日 上午9:42:15
 */
public class RandomUtil {

	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random random = new Random();
		
		int i = random.nextInt(max - min+1)+min;
		
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		int[] arry = new int[subs];
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()!=subs) {
			int i = random(min, max);
			set.add(i);
		}
		Iterator<Integer> iterator = set.iterator();
		for (int i = 0; i < subs; i++) {
			arry[i] = iterator.next();
		}
		
		
		return arry;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "1234567890qwertyuiopasdfghjklzxcvbnm";
		
		return str.charAt(random(0, str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str= "";
		
		for(int i = 0;i<length;i++) {
			str+=randomCharacter();
		}
		return str;
	}

}
