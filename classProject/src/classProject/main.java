package classProject;

public class main {

	public static void main(String[] args) {
		//�л� �ν��Ͻ� ����
		Student student1 = new Student("�л�1", 1, 10000);
		//���� �ν��Ͻ� ����
		Bus bus301 = new Bus(301, 0, 0);
		//����ö �ν��Ͻ� ����
		//Subway subway1 = new Subway(1, 0, 0);
		
		student1.takeBus(bus301);
		student1.showInfo();
		bus301.showInfo();
		
	}

}
