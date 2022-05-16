package classProject;

public class main {

	public static void main(String[] args) {
		//학생 인스턴스 생성
		Student student1 = new Student("학생1", 1, 10000);
		//버스 인스턴스 생성
		Bus bus301 = new Bus(301, 0, 0);
		//지하철 인스턴스 생성
		//Subway subway1 = new Subway(1, 0, 0);
		
		student1.takeBus(bus301);
		student1.showInfo();
		bus301.showInfo();
		
	}

}
