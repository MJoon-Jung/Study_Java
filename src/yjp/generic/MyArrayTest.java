package yjp.generic;

public class MyArrayTest {
	public static void main(String[] args) {
		
		MyArrayList<Integer> list = new MyArrayList<>();
		
		for(int i = 1; i < 11; i++) {
			list.add(i);
		}
		
		for(int i =0; i < list.size(); i++) {
			System.out.print(list.get(i) + " , ");
		}
		System.out.println();
		
		list.add(2, 2222);
		
		list.add(5, 555555);
		
		for(int i =0; i < list.size(); i++) {
			System.out.print(list.get(i) + " , ");
		}
		System.out.println();
		
	}
}
