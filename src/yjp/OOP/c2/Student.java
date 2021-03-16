package yjp.OOP.c2;

import java.util.Arrays;

import yjp.OOP.c2.Person;

public class Student extends Person{
   private int [] grade = new int [10];
   private int idx = 0;
   
   public int[] getGrade() {
      int [] copy = Arrays.copyOf(grade, idx);
      return copy;
   }
   public double getAverage() {
      double sum = 0.0;
      for(int i = 0; i < idx;i++) {
         sum += grade[i];
      }
      double result = (double)(sum/idx);
      return result;
      
   }
//   public int [] copy(int [] original, int n) {
//      int [] copy = new int [n];
//      for(int i = 0; i < n; i++) {
//         copy[i] = original[i];
//      }
//      return copy;
//   }
   public void setGrade(int[] grade) {
      this.grade = grade;
   }
   public void addGrade(int score) {
      grade[idx++] = score;
   }
//   public void printGrade() {
//      System.out.println("grade : " + Arrays.toString(getGrade()));
//   }
   @Override
   public String toString() {
	   String str = "professor class 입니다";
	   return str;
   }
   public void test() {
	   System.out.println("test입니다");
   }
   
   @Override
   public void print() {
      System.out.println("name: "+getName() + "\t sid : "+ getSid() + "\t gender : " + getGender() + 
    		  "\t phonenumber : " + getPhone() + "\t grades : "+ Arrays.toString(getGrade()));
   }
}