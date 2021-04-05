package yjp.CollectionFrameWork;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		createNum();
	}
	public static void createNum() {
		Set<Integer> set = new TreeSet<>();
		
		for(int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			set.add(random);
		}
		System.out.println(set);
	}
}
