package yjp.OOP.c1;

public class Person {
	private String name;
	private String sid;
	private String gender;
	private String phone;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getSid() {
		System.out.println(sid);
	}
	
	public void setSid(String sid) {
		//sid가 숫자로만 구성되었는지 체크
		//그렇다면 설정..
		// 그렇지 않다면
		// 욕치고 설정하지 않는다.
		boolean checkResult = isNumberic(sid);
		if(checkResult)
			this.sid = sid;
		else {
			System.out.println("Retry input number");
		}
	}
	private boolean isNumberic(String sid) {
		for(int i = 0; i < sid.length(); i++) {
			char c = sid.charAt(i);
			if(c < '0' || c > '9')
				return false;
		}
		return true;
		
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
