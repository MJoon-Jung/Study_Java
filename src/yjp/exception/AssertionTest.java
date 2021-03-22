package yjp.exception;

import java.util.Scanner;

public class AssertionTest {
	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){
			System.out.println("input date");
			int date = input.nextInt();
			
			
			assert date >= 1 && date <= 31;
			System.out.printf("data : %d\n", date);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
