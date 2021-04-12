package yjp.CollectionFrameWork;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class StackTest {
	public static void main(String[] args) {
//		test1();
//		test2();
//		String s1 = "2*(3+2)/(3+1)/2*5-1+10";
//		String s2 = "2 * ( 3 + 2 ) / ( 3 + 1 / 2 ) * 5 ) – 1 + 10 ";
//		String s3 = "2 * ( 3 + 2 ) / ( 3 + ( 1 / 2 ) * 5 ) – 1 + 10 ";
//		test3(s1);
//		test3(s2);
//		test3(s3);
//		test4();
		test6("3 + 4 * 2");
		test6("3 + 4");
	}
	// 후위 표기법
	public static void test6(String s) {
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String [] ar = s.split(" ");
		boolean isStart = false;
		
		for(int i = 0; i < ar.length; i++) {
			char tmp = ar[i].charAt(0);
			
			if(tmp - '0' >= 0 && tmp - '0' <= 9) {
				stack1.push(ar[i]);
			}else {
				stack2.push(ar[i]);
			}
		}
		int sum = Integer.MIN_VALUE;
		
		while(!stack2.isEmpty()) {
			if(!isStart) {
				sum = Integer.valueOf(stack1.pop());
				isStart = true;
			}
			int n = Integer.valueOf(stack1.pop());
			
			String oper = stack2.pop();
			
			switch(oper) {
			case "*":
				sum *= n;
				break;
			case "/":
				sum /= n;
				break;
			case "+":
				sum += n;
				break;
			case "-":
				sum -= n;
				break;
			}
		}
		if(sum != Integer.MIN_VALUE) {
			System.out.println(sum);
		}else {
			System.out.println("error");
		}
		
	}
	public static void test3(String s) {
		Stack<Character> stack = new Stack<>();
		s.replace(" ", "");
		
		for(int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if(tmp == '(') {
				stack.push(tmp);
			}else if(tmp == ')') {
				if(stack.isEmpty()) {
					System.out.println("잘못된 식");
					return;
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			System.out.println("올바른 식");
		}else {
			System.out.println("잘못된 식");
		}
	}
	public static void test5(String s) {
		Stack<Character> stack = new Stack<>();
		s.replace(" ", "");
		char [] ar = s.toCharArray();
		for(int i = 0; i < ar.length; i++) {
			char tmp = ar[i];
			if(tmp == '(') {
				stack.push(tmp);
			}else if(tmp == ')') {
				if(stack.isEmpty()) {
					System.out.println("잘못된 식");
					return;
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			System.out.println("올바른 식");
		}else {
			System.out.println("잘못된 식");
		}
	}
	public static void test2() {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < 26; i++) {
			stack.push((char)(65+i));
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	public static void test1() {
		Stack<Integer> stack = new Stack();
		IntStream.rangeClosed(1, 10).forEach(i ->{
			stack.add(i);
		});
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	public static void test4() {
		String str = "Apple, Grape, Banana, Melon, Strawberry";
		StringTokenizer st = new StringTokenizer(str, ", ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
