package yjp.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class UtilTest {
	   public static void main(String[] args) {
//	      Integer[] arr = {3,4,2,10,38,76,92,124,13,24};
//	      Double[] arr = {3.0,4.0,2.0,10.0,3.8,76.0,9.2,12.4,13.0,24.0};
		  ArrayList<Integer> arr = new ArrayList<>();
		  for(int i = 1; i <= 10; i++) {
			  arr.add(i);
		  }
//		  Student [] arr = {new Student("��", 75), new Student("��", 100), new Student("��", 12), new Student("��", 55)};
//		  String [] arr = {"hgdgasdg","sdg","zdafas"};
//	      System.out.print("�迭�� ��: ");
//	      Util.println(arr);
//	      System.out.println("�ִ밪: " + Util.getMax(arr));
		  
//		  Util.printValueOf5Times(1.3f);
//		  Util.printSum(Arrays.asList(arr));
	      Util.printSum2(arr);
//	      Util.printSum3(arr);
	   }
	}