package yjp.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetText2 {
	
	public static void main(String[] args) {
		test1();
	}
	
	
	private static void test1() {
		/*
		 * 합집합 : addAll()
		 * 교집합 : retainAll()
		 * 차집합 : removeAll()
		 * 
		 * set1 : {1,3,4,5,7,9,10}
		 * set2 : {2,4,10}
		 * 
		 * set1 U set2 : {1,2,3,4,5,7,9,10}
		 * set1 interection set2 : {4,10}
		 * set1 - set2 : {1,3,5,7,9}
		 */
		Integer [] ar = {1,3,4,5,7,9,10};
		Integer [] ar2 = {2,4,10};
		ArrayList<Integer>list = new ArrayList<>(Arrays.asList(ar));
		ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(ar2));
		Set<Integer> set1 = new HashSet<>(list);
		Set<Integer> set2 = new HashSet<>(list2);
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2);
		System.out.println("--------------------------------------------------------------");
		//합집합
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		System.out.println("합집합 : " + unionSet);
		
		
		//교집합
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);
		System.out.println("교집합 : " + intersectionSet);
		
		//차집합
		Set<Integer> diffSet = new HashSet<>(set1);
		diffSet.removeAll(set2);
		System.out.println("차집합 : " + diffSet);
		
		//완전 동일한가
		boolean flag = set1.containsAll(set2);
		
		if(flag) {
			System.out.printf("집합 %s 는 %s 의 모든 원소를 포함합니다.\n",set1, set2);
		}else {
			System.out.printf("집합 %s 는 %s 의 모든 원소를 포함하지 않습니다.\n",set1, set2);
		}		
	}
}

















