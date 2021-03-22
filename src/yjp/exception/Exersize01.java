package yjp.exception;

import java.util.Scanner;

public class Exersize01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		int val = Integer.MIN_VALUE;
//		try (val = sc.nextInt()){
//			
//		}catch(Exception e) {
//			
//		}
//		
		while(true) {
			try {
				int val = getInput();
				System.out.println(val);
			}catch(Exception e) {
				System.out.println("error");
				System.exit(0);
			}
		}
		
//		while(true) {
//			int val = getInput();
//			
//			if(val == -1) {
//				System.out.println("error");
//				break;
//			}else {
//				System.out.println(val);
//			}
//		}
	}
	private static int getInput() throws Exception{
		String val = sc.nextLine();
		int v = Integer.parseInt(val);
		for(int i = 0; i < val.length(); i++) {
			if(v < 0 || v > 9)
				throw new Exception();
		}
		
		return Integer.parseInt(val);
	}
}
