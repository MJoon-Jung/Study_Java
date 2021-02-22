package yjp.OOP.interfaceTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i <= 7; i++)list.add(i);
//		for(int i : list)System.out.println(i);
		
		list.forEach((t) -> System.out.println(t));
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//			
//		});
	}
}
