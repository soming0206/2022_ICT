package staticEx;

public class main {

	public static void main(String[] args) {
		Student.addSerialNum();  //instance를 생성하지 않고 클래스 명으로 호출 가능
		System.out.println(Student.serialNum);
		
		Student student = new Student(); //instance 생성
		System.out.println(student.serialNum);
		
		Student.serialNum++;
		//Student.serialNum+=1;
		//Student.serialNum*=2;
		System.out.println(student.getSerialNum());
		System.out.println(Student.getSerialNum());
	}

}
