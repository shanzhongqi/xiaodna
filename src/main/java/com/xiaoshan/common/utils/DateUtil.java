package com.xiaoshan.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: ���ݳ�������������
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date date) {
		return 0;
		
	}
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: ����ָ���·ݵ���ĩ���ڱ��� 2020-02-28 , ���� 2020-02-29 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//��ȡ������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//�������·�+1�� �ٱ���³� -1 ��
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());//���·�+1
		c.setTime(initMonth);//�ٱ���³�
		
		c.add(Calendar.SECOND, -1);//��ȥ1��
		return c.getTime();
		
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: ����ָ�����ڵ��³������� 2020-02-28 , ���� 2020-02-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public  static Date  getInitMonth(Date date) {
	//��ȡһ��������
		Calendar c = Calendar.getInstance();//��ȡ��ǰϵͳʱ���������
		//�ô���������ٳ�ʼ��������
		c.setTime(date);
		//�������������ط���
		c.set(Calendar.DAY_OF_MONTH, 1);//������Ϊ���µĵ�һ��
		c.set(Calendar.HOUR_OF_DAY, 0);//Сʱ
		c.set(Calendar.MINUTE, 0);//����
		c.set(Calendar.SECOND, 0);//��
		
		return c.getTime();
		
	}
	
	
	
	

	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param min ��С����
	 * @param max �������
	 * @return �� min ��max֮����������
	 * @return: Date
	 */
	public  static Date randomDate(Date min,Date max) {
		// ��ȡ��С���ڵĺ�����.��1970��min �ĺ�����
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		if(t1 > t2 ) return null;
		
		double d = Math.random();  //����0-1 ֮������ֵ
	    long x = (long) (d *(t2 - t1 +1 )+t1);
		return new Date(x);
		
	}
	
}
