package classProject;

public class Bus {
	private int bNumber;
	private int bPassengers;
	private int bMoney;
	
	//����  ���� ������
	public Bus(int bNumber, int bPassengers, int bMoney) {
		this.bNumber = bNumber;
		this.bPassengers = bPassengers;
		this.bMoney = bMoney;
	}
	
	//getter
	public int getBnumber() {
		return bNumber;
	}
	public int getBpassengers() {
		return bPassengers;
	}
	public int getBmoney() {
		return bMoney;
	}
	
	//���� ����
	public void take(int money) {
		bMoney += money;
		bPassengers++;
	}
	
	public void showInfo() {
		System.out.print(bNumber + "���� ���� ����: " + this.getBmoney() + "��");
		System.out.println("/" +"�°� ��: " + bPassengers + "�� �Դϴ�.");
	}
}
