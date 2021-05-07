package submit_wdj;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
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
//		test5();
//		test6("3 + 4 * 2");
//		test6("3 + 4");
//		test10();
		
	}
	public static void test5() {
		Queue<Integer> queue = new PriorityQueue<>();
		
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 100 + 1);
			System.out.print(r + " ");
			queue.offer(r);
		}
		System.out.println();
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}
	// 후위 표기법
	public static void test6(String s) {
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String [] ar = s.split(" ");
		boolean isStart = false;
		
		
		//안에 들어간 원소가 첫 글자가 숫자면 숫자스택 아니면 연산자 스택
		for(int i = 0; i < ar.length; i++) {
			char tmp = ar[i].charAt(0);
			
			if(tmp - '0' >= 0 && tmp - '0' <= 9) {
				stack1.push(ar[i]);
			}else {
				stack2.push(ar[i]);
			}
		}
		
		
		
		int sum = Integer.MIN_VALUE;
		
		
//		하나씩 빼내면서 계산한다.
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
		//MIN_VALUE 으로 쉽게 나올수 없는 값을 선택해 실행 되어서 값이 변했는지 판단함.
		if(sum != Integer.MIN_VALUE) {
			System.out.println(sum);
		}else {
			System.out.println("error");
		}
		
	}
	// () 괄호의 올바른 식인지 판단
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
	//StringTokenizer 
	public static void test4() {
		String str = "Apple, Grape, Banana, Melon, Strawberry";
		StringTokenizer st = new StringTokenizer(str, ", ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	private static void test10() {
//		Queue<Task> q = new PriorityQueue<>();
		Queue<Task> q = new PriorityQueue<>(
					(o1,o2) -> o1.priority - o2.priority
				);
		
		q.add(new Task(0, "직업1"));
		q.add(new Task(1,"직업5"));
		q.add(new Task(2,"직업2"));
		q.add(new Task(3,"직업11"));
		q.add(new Task(4,"직업52"));
		q.add(new Task(5,"직업4212"));
		q.add(new Task(6,"직업42"));
		q.add(new Task(7,"직업9"));
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
class Task implements Comparable<Task>{
	int priority;
	String desc;
	
	public Task(int priority, String desc) {
		this.priority = priority;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Priority : " + priority + "  desc :  " + desc;
	}
	@Override
	public int compareTo(Task o) {
		if(this.desc.length() != o.desc.length()) {	
			return this.desc.length() - o.desc.length();
		}else {
			for(int i = 0; i < desc.length(); i++) {
				if(this.desc.charAt(i) != o.desc.charAt(i)) {
					return compareString(this.desc.charAt(i), o.desc.charAt(i));
				}
			}
		}
		return 0;
	}	
	public int compareString(char a, char b) {
		return a - b;
	}
}