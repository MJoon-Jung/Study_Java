package yjp.CollectionFrameWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		try {
			Scanner sc = new Scanner(new File("wordbook.txt"));
			int n = 0;
			while(sc.hasNext()) {
				set.add(sc.nextLine());
				n++;
			}
			System.out.println("set size : " + set.size() + "  word total : " + n);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
