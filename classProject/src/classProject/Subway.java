package classProject;

public class Subway {
	private int sNumber;
	private int sPassengers;
	private int sMoney;
	
	//����ö ���� ������
	public Subway(int sNumber, int sPassengers, int sMoney) {
		this.sNumber = sNumber;
		this.sPassengers = sPassengers;
		this.sMoney = sMoney;
	}
	
	//getter
	public int getSnumber() {
		return sNumber;
	}
	public int getSpassengers() {
		return sPassengers;
	}
	public int getSmoney() {
		return sMoney;
	}
	
	//����ö ����
	public void take(int money) {
		sMoney += money;
		sPassengers++;
	}
	
	public void showInfo() {
		System.out.println(sNumber + "ȣ���� ���� ����: " + this.getSmoney() + "��");
	}
}
