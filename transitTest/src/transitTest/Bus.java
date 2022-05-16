package transitTest;

public class Bus {
	private static Bus instance;
	
	int price;
	int studentPrice;
	int workerPrice;
	int passangers;
	
	private Bus() {
		System.out.println("===���� ���� ����===");
	}
	
	public static Bus getInstance() {
		if(instance == null) {
			instance = new Bus();
		}
		return instance;
	}
	
	public void takeBus(People people) {
		if(people.job == "������") {
			this.price += 1250;
			passangers++;
			if(people.price <1250) {
				passangers -= passangers;
			}
		}
		if(people.job == "�л�") {
			if(people.price >720) {
			this.price += 720;
			passangers++;
			}
			else {
				passangers -= passangers;
			}
		}
	}
}
