package abstractEx;

public abstract class Computer {
	public abstract void display(); // �߻� �޼���
	public abstract void typing(); //�߻� �޼���

	public void turnOn() { //�Ϲ� �޼���
		System.out.println("������ ŵ�ϴ�.");
	}
	
	public void turnoff() { //�Ϲ� �޼���
		System.out.println("������ ���ϴ�.");
	}
}

