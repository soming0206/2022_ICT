package classProject;

public class Student {
	private String name;
	private int grade;
	private int money;
	
	//�л� ���� ������
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getMoney() {
		return money;
	}
	
	//���� Ÿ��
	public void takeBus(Bus bus) {
		//������ ���� ������
		bus.take(1000);
		//���� ������ �ִ� ������ ��������
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(name + "�� ���� ���� ��: " + this.getMoney() + "��");
	}
}
