package staticEx;

public class Student {
	//static 변수
	static int serialNum = 1000;
	
	//static 메서드
	public static void addSerialNum() {
		serialNum++;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}
