package oop;

public class MyMathTest2 {
	long a,b;
	
	long add() {return a+b;}
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a,long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}

	public static void main(String[] args) {
		
		System.out.println(MyMathTest2.add(200L, 100L));
		System.out.println(MyMathTest2.subtract(200L, 100L));
		System.out.println(MyMathTest2.multiply(200L, 100L));
		System.out.println(MyMathTest2.divide(200.0, 100.0));
		System.out.println("天天天天天天天天天天天天天");
		System.out.println(add(200L,100L));
		System.out.println(subtract(200L,100L));
		System.out.println(multiply(200L,100L));
		System.out.println(divide(200.0,100.0));
		
	}

}
