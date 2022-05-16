package classProject;

public class Student {
	private String name;
	private int grade;
	private int money;
	
	//학생 정보 생성자
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
	
	//버스 타기
	public void takeBus(Bus bus) {
		//버스에 돈을 지불함
		bus.take(1000);
		//현재 가지고 있는 돈에서 빠져나감
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(name + "의 현재 남은 돈: " + this.getMoney() + "원");
	}
}
