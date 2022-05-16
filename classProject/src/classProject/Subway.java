package classProject;

public class Subway {
	private int sNumber;
	private int sPassengers;
	private int sMoney;
	
	//지하철 정보 생성자
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
	
	//지하철 수입
	public void take(int money) {
		sMoney += money;
		sPassengers++;
	}
	
	public void showInfo() {
		System.out.println(sNumber + "호선의 현재 수익: " + this.getSmoney() + "원");
	}
}
