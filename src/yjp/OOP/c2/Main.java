package yjp.OOP.c2;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      Student std1 = new Student();
      std1.setName("JOON");
      std1.setDept("computer");
      std1.setGender("male");
      std1.setPhone("010-1111-1111");
//      System.out.println(std1.toString());
//      std1.setGrade(new int [] {99,90,85,97});
      std1.addGrade(90);
      std1.addGrade(87);
      std1.addGrade(96);
      std1.addGrade(53);
//      std1.print();
//      std1.printGrade();
//      System.out.println(std1.getAverage());;
      
      
      Professor prof1 = new Professor();
      String [] profLects = new String[] {"basic Programming", "Web Programming"};
      prof1.setLectures(profLects);
      String [] lects = prof1.getLectures();
//      System.out.println(Arrays.toString(lects));
      lects[1] = "Network";
//      System.out.println(Arrays.toString(lects));
      prof1.setName("Tom");
      prof1.setGender("female");
      prof1.setDept("computer");
      prof1.setPhone("010-1234-1234");
//      prof1.print();
//      prof1.printLectures();
      
      Person person = new Person();
      GraduateStudent std2 = new GraduateStudent();
      person = std1;
      person = std2;
//      person = prof1;
      
//      person.print();
      
      
      Person[] pArr = new Person[3];
      pArr[0] = new Person();
      pArr[0].setName("123");
      pArr[1] = new Person();
      pArr[1].setName("13");
      pArr[2] = new Person();
      pArr[2].setName("23");
      
//      print(pArr);
      
      Student[] sArr = new Student[3];
      sArr[0] = new Student();
      sArr[0].setName("123");
      sArr[1] = new Student();
      sArr[1].setName("13");
      sArr[2] = new Student();
      sArr[2].setName("23");
      print(sArr);
   }
   public static void print(Person [] pArr) {
	   for(int i = 0; i < pArr.length; i++) {
		   pArr[i].print();
//		   if(pArr[i] instanceof Student) {
//			   ((Student)pArr[i]).test();
//		   }
	   }
   }

}