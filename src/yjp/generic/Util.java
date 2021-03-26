package yjp.generic;

import java.util.List;

public class Util {
   public static <T extends Comparable<T>> T getMax(T[] arr) { // 제네릭 메소드는 return type 앞에 제네릭을 명시해준다
      // compareTo 을 구현하고 있는 T로 제한한다.
      // 내부의 맴버변수를 사용하지않아서 static으로 만듦
      T max = arr[0];
      for(int i=0; i<arr.length; i++)
         if(max.compareTo(arr[i]) < 0) max = arr[i];
      
      return max;
   }
   
   public static <T> void println(T[] arr) { // void가 리턴타입
      for(int i=0; i<arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
//   public static <T extends Number> void printValueOf5Times(T value) {
//	   Double result =  value.doubleValue()	* 5;
//	   System.out.println(result);
//   }
   public static <T extends Number> void printSum(List <T> list) {
	   Double sum = 0.0;
	   
	   for(T val : list) sum += val.doubleValue();
	   System.out.println(sum);
   }
   // Q1) List <? extends Number> 와 List<Number> 차이
   public static void printSum2(List <? extends Number> list) {
	   Double sum = 0.0;
	   
	   for(Number val : list) sum += val.doubleValue();
	   System.out.println(sum);
   }
}