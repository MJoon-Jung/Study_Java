package yjp.CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PhoneBook {
	
	public static void main(String[] args) {
//		Group wdj = new Group("wdj");
//		wdj.phonebook.put("MJOON", "010-8991-5121");
//		wdj.phonebook.put("Mongo", "010-1321-2651");
//		wdj.phonebook.put("heun", "010-3171-3283");
//		wdj.phonebook.put("Tom", "010-4212-3829");
//		wdj.phonebook.put("Jane", "010-6211-1279");
//		wdj.phonebook.put("Dong", "010-6361-6590");
//		wdj.phonebook.put("KUN", "010-1731-5490");
//		wdj.phonebook.put("KIM", "010-4211-8513");
//		
//		System.out.println(wdj);
		
		
		Map<String,String> Agroup = new TreeMap<>();
		Agroup.put("MJOON", "010-8991-5121");
		Agroup.put("Mongo", "010-1321-2651");
		Agroup.put("heun", "010-3171-3283");
		Agroup.put("Tom", "010-4212-3829");
		Agroup.put("Jane", "010-6211-1279");
		Agroup.put("Dong", "010-6361-6590");
		Agroup.put("KUN", "010-1731-5490");
		Agroup.put("KIM", "010-4211-8513");
		Map<String,String> Bgroup = new TreeMap<>();
		Bgroup.put("ncvMJOON", "010-8991-5121");
		Bgroup.put("gewMongo", "010-1321-2651");
		Bgroup.put("sadheun", "010-3171-3283");
		Bgroup.put("dsaTom", "010-4212-3829");
		Bgroup.put("Jansade", "010-6211-1279");
		Bgroup.put("Donsdag", "010-6361-6590");
		Bgroup.put("KUsadN", "010-1731-5490");
		Bgroup.put("KIsaM", "010-4211-8513");
		
		Map<String, Map<String,String>> phonebook = new HashMap<>();
		phonebook.put("A반", Agroup);
		phonebook.put("B반", Bgroup);
		
		for(String Gname : phonebook.keySet()) {
			String ans = "";
			ans += Gname + "\n";
			
			for(String name : phonebook.get(Gname).keySet()) {
				Map<String,String> tmp = phonebook.get(Gname);
				String num = tmp.get(name);
				ans += name + " : " + num +"\n";
			}
			System.out.println(ans);
		}
		
//		Iterator<Map.Entry<String, Map<String,String>>>  iter = phonebook.entrySet().iterator();
//		
//		while(iter.hasNext()) {
//			String ans = "";
//			Map.Entry<String, Map<String,String>> entryset = iter.next();
//			String Gname = entryset.getKey();
//			ans += Gname + "\n";
//			Map<String,String> gp = entryset.getValue();
//			
//			Iterator<Entry<String, String>> iter2 = gp.entrySet().iterator();
//			while(iter2.hasNext()) {
//				Entry<String,String> entry = iter2.next();
//				String name = entry.getKey();
//				String num = entry.getValue();
//				
//				ans += name + " : " + num +"\n";
//			}
//			System.out.println(ans);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("어느 반? exit: q");
//			String group = sc.nextLine();
//			
//			if(group.equalsIgnoreCase("q")) {
//				break;
//			}
//			
//			Map<String,String> groupPB = phonebook.get(group);
//			if(groupPB == null) {
//				System.out.println("not exists");
//				continue;
//			}
//			System.out.println("누구?");
//			String who = sc.nextLine();
//			String phone = groupPB.get(who);
//			if(phone == null) {
//				System.out.println("그런 학생은 없어요...");
//			}
//			System.out.println(group + " 의  " + who + " : " + phone);
//		}
//		sc.close();
//		System.out.println("종료합니다.");
	}
}

//class Group {
//	Map<String,String> phonebook = new TreeMap<>();
//	private String name;
//	public Group(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String toString() {
//		String answer = "";
//		Set<Map.Entry<String,String>> entryset = phonebook.entrySet();
//		Iterator<Map.Entry<String,String>> iter = entryset.iterator();
//		
//		while(iter.hasNext()) {
//			Map.Entry<String, String> map = iter.next();
//			String key = map.getKey();
//			String value = map.getValue();
//			
//			answer += "key : " + key + "  value : " + value + "\n";
//		}
//		
//		return answer;
//	}
//}
