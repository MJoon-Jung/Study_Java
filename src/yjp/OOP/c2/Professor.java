package yjp.OOP.c2;

import java.util.Arrays;

import yjp.OOP.c2.Person;

public class Professor extends Person {
   private String[] lectures;

   public String[] getLectures() {
      if(lectures == null) {
//         return new String [] {"없음"};
    	  return null;
      }
      String [] copy = Arrays.copyOf(lectures,lectures.length);
      return copy;
   }

   public void setLectures(String[] lectures) {
      this.lectures = new String [lectures.length];
      for(int i =0; i < lectures.length; i++) {
         this.lectures[i] = lectures[i];
      }
   }
//   public void printLectures() {
//      System.out.println("Lectures : " + Arrays.toString(lectures));
//   }
   @Override
   public void print() {
	   String lec = "없음";
	   if(lectures != null) {
		   lec = "";
		   for(int i = 0; i < lectures.length; i++) {
			   lec += (lectures[i] + "  ");
		   }
	   }
      System.out.println("name: "+getName() + "\t sid : "+ getSid() + "\t gender : " + getGender() + "\t phonenumber : " +
    		  getPhone() + "\t lectures : "+ lec);
   }
   
}