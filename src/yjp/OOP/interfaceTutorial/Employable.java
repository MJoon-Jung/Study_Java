package yjp.OOP.interfaceTutorial;

public interface Employable {
	String getName();
	
	static boolean isEmpty(String str) {
		if(str == null || str.trim().length() == 0) {
			return true;
		}
		return false;
	}
	
}
