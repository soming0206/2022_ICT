package abstractEx2;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public final void run() {
		startCar();
		drive();
		stop();
		turnoff();
	}
}
