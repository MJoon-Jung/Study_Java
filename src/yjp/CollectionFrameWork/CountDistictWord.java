package yjp.CollectionFrameWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountDistictWord {
	public static void main(String[] args) {
		countDistictword();
	}
	private static void countDistictword() {
		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new TreeMap<>();
		
		File file = new File("wordbook.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String s = null;
			while((s = br.readLine()) != null) {
				s.trim();
				set.add(s);
				Integer n = map.get(s);
				if(n == null) {
					map.put(s, 1);
				}else {					
					map.put(s, n+1);
				}
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set<String>key = map.keySet();
		Iterator<String> iter = key.iterator();
		
		while(iter.hasNext()) {
			String Key = iter.next();
			Integer value = map.get(Key);
			System.out.println("Key : " + Key + "   value : " + value);
		}
	}
}
