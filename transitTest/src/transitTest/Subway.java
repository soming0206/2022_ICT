package transitTest;

public class Subway {
	private static Subway instance;
	
	int price;
	int studentPrice;
	int workerPrice;
	int passangers;
	
	private Subway() {
		System.out.println("===����ö ���� ����===");
	}
	
	public static Subway getInstance() {
		if(instance == null) {
			instance = new Subway();
		}
		return instance;
	}
	
	public void takeSubway(People people) {
		if(people.job == "������") {
			this.price += 1250;
			passangers++;
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
