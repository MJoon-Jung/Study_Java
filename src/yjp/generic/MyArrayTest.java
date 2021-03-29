package yjp.generic;

public class MyArrayTest {
	public static void main(String[] args) {
		
		MyArrayList<Integer> list = new MyArrayList<>();
		
		for(int i = 1; i < 11; i++) {
			list.add(i);
		}
		list.add(2,1222);
		list.add(8,222222);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------");
		list.remove(0);
		list.remove(Integer.valueOf(222222));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
