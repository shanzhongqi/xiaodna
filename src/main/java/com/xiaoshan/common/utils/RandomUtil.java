package com.xiaoshan.common.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


/**
 * 
 * @ClassName: RandomUtil 
 * @Description: ���������
 * @author: С��
 * @date: 2020��2��27�� ����9:42:15
 */
public class RandomUtil {

	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random random = new Random();
		
		int i = random.nextInt(max - min+1)+min;
		
		return i;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
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
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str = "1234567890qwertyuiopasdfghjklzxcvbnm";
		
		return str.charAt(random(0, str.length()-1));
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String str= "";
		
		for(int i = 0;i<length;i++) {
			str+=randomCharacter();
		}
		return str;
	}

}
