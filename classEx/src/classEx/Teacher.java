package classEx;

public class Teacher {
	String tName;
	String gender;
	int age;
	String phoneNumber;
	String address;
	int grade;
	String appearance;
	
	
	public Teacher(){ //생성자(클래스이름이랑 같아야함)
		tName = "이름 미입력";
		gender = "성별 미입력";
		age = 0;
		phoneNumber = "연락처 미입력";
		address = "주소 미입력";
		grade = 0;
		appearance = "외모 미입력";	
	}
	
	public Teacher(String _name, String _gender, int _age, String _phone, String _address, int _grade, String _appear) {
		tName = _name;
		gender = _gender;
		age = _age;
		phoneNumber = _phone;
		address = _address;
		grade = _grade;
		appearance = _appear;
	}
	
	public void showInfo() {
		System.out.println(getName());
		System.out.println(getGender());
		System.out.println(getAge());
	}
	
	//getter
	public String getName() {
		return tName;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public int getGrade() {
		return grade;
	}
	public String getAppearance() {
		return appearance;
	}
	
	//setter
	public void setName(String tName) {
		this.tName = tName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
}
