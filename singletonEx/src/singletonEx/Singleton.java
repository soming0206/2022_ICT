package singletonEx;

public class Singleton {
	private static Singleton instance;  //static���� Singleton ������ ����
	
	private Singleton() { //�ν��Ͻ� �ϳ��� ���� �� �ְ��Ϸ��� private���� ����
		System.out.println("�⺻ ������ ȣ��");
	}
	
	public static Singleton getInstance() { //�ڱ� �ڽ��� ��ȯ�ϰڴ�
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
