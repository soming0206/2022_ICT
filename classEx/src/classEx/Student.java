package classEx;

public class Student {
	//Ŭ���� ���� ������� ����
	//������ �����ֱ�� �� ��
	String studentName;
	int grade;
	int studentId;
	String address;
	String major;
	String skill;
	String phoneNumber;
	
	public Student(){
		this("���ҿ�", 4, 1851015);
		System.out.println("�⺻ ������ ȣ��");
	}
	
	public Student(String studentName, int grade, int studentId) {
		System.out.println("�ι�° ������ ȣ��");
		this.studentName = studentName;
		this.grade = grade;
		this.studentId = studentId;
	}
	
	//get�Լ�
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
	
	
	//set�Լ�
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
