package staticEx;

public class Student {
	//static ����
	static int serialNum = 1000;
	
	//static �޼���
	public static void addSerialNum() {
		serialNum++;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}
