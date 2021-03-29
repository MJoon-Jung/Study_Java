package yjp.generic;

import java.util.ArrayList;

public class UtilTest2 {
	public static void main(String[] args) {
		Number n = Integer.valueOf(100);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		process(list);
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(2.5);
		process(list2);
		
		/*
		 * Generic�� �� ���°�
		 * ������ ���� ���������� ����ϴ� �������� Ÿ�Ը�
		 * �ٸ� ��쿡�� �ϳ��� Ŭ������ �����ؼ� ����� �� �ֵ���
		 * �ϱ� ����
		 * ������ ���� ������ Ÿ���� 
		 * ��ü ���� �ÿ� type parameter�� �޾Ƽ� ó��
		 * �׸��� ������� type casting�� ���ص� �ǵ��� �ϱ� ����
		 */
	}
	public static void process(ArrayList <? extends Number> list) {
		System.out.println(list.get(0));
	}
//	public static void process(ArrayList<Number> list) {
//		
//	}
}
