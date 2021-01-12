package yjp.OOP;

import java.util.Scanner;

public class inputTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Start input www~");
			String s = sc.nextLine();
			
			if(s.equalsIgnoreCase("quit")) {
				System.out.println("Exit");
				break;
			}
			
			if(s.startsWith("www")) {
				System.out.println("www~ ");
			}
			else {
				System.out.println("not www~");
			}
		}

	}

}
