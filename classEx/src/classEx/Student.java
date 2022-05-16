package classEx;

public class Student {
	//클래스 내의 멤버변수 선언
	//변수의 생명주기는 블럭 안
	String studentName;
	int grade;
	int studentId;
	String address;
	String major;
	String skill;
	String phoneNumber;
	
	public Student(){
		this("엄소연", 4, 1851015);
		System.out.println("기본 생성자 호출");
	}
	
	public Student(String studentName, int grade, int studentId) {
		System.out.println("두번째 생성자 호출");
		this.studentName = studentName;
		this.grade = grade;
		this.studentId = studentId;
	}
	
	//get함수
	public String getStudentName() {
		return studentName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	//set함수
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setgrade(int grade) {
		this.grade = grade;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
