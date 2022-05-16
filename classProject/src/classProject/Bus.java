package classProject;

public class Bus {
	private int bNumber;
	private int bPassengers;
	private int bMoney;
	
	//버스  정보 생성자
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
	
	//버스 수입
	public void take(int money) {
		bMoney += money;
		bPassengers++;
	}
	
	public void showInfo() {
		System.out.print(bNumber + "번의 현재 수익: " + this.getBmoney() + "원");
		System.out.println("/" +"승객 수: " + bPassengers + "명 입니다.");
	}
}
