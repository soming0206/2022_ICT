package staticEx;

public class main {

	public static void main(String[] args) {
		Student.addSerialNum();  //instance�� �������� �ʰ� Ŭ���� ������ ȣ�� ����
		System.out.println(Student.serialNum);
		
		Student student = new Student(); //instance ����
		System.out.println(student.serialNum);
		
		Student.serialNum++;
		//Student.serialNum+=1;
		//Student.serialNum*=2;
		System.out.println(student.getSerialNum());
		System.out.println(Student.getSerialNum());
	}

}
