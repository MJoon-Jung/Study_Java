package yjp.OOP.c2;

import java.util.Arrays;

public class Person {
   private String name;
   private String sid;
   private String gender;
   private String phone;
   private String dept;
   
//   public Person(String name, String sid, String gender, String phone, String dept) {
//	   this.name = name;
//	   this.sid = sid;
//	   this.gender = gender;
//	   this.phone = phone;
//	   this.dept = dept;
//   }
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getSid() {
      return sid;
   }
   
   public void setSid(String sid) {
      boolean checkResult = isNumberic(sid);
      if(checkResult)
         this.sid = sid;
      else {
         System.out.println("Retry input number");
      }
   }
   private boolean isNumberic(String sid) {
      for(int i = 0; i < sid.length(); i++) {
         char c = sid.charAt(i);
         if(c < '0' || c > '9')
            return false;
      }
      return true;
      
   }
   public String getGender() {
      return gender;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getDept() {
      return dept;
   }

   public void setDept(String dept) {
      this.dept = dept;
   }
   public void print() {
      System.out.println("name: "+name + "\t sid : "+ sid + "\t gender : " + gender + "\t phonenumber : " + phone);
   }
}