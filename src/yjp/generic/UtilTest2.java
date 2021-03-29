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
		 * Generic은 왜 쓰는가
		 * 로직은 같고 내부적으로 사용하는 데이터의 타입만
		 * 다른 경우에도 하나의 클래스만 생성해서 사용할 수 있도록
		 * 하기 위해
		 * 실제로 사용될 데이터 타입은 
		 * 객체 생성 시에 type parameter로 받아서 처리
		 * 그리고 명시적인 type casting도 안해도 되도록 하기 위해
		 */
	}
	public static void process(ArrayList <? extends Number> list) {
		System.out.println(list.get(0));
	}
//	public static void process(ArrayList<Number> list) {
//		
//	}
}
