package transitTest;

public class Subway {
	private static Subway instance;
	
	int price;
	int studentPrice;
	int workerPrice;
	int passangers;
	
	private Subway() {
		System.out.println("===지하철 최초 생성===");
	}
	
	public static Subway getInstance() {
		if(instance == null) {
			instance = new Subway();
		}
		return instance;
	}
	
	public void takeSubway(People people) {
		if(people.job == "직장인") {
			this.price += 1250;
			passangers++;
		}
		if(people.job == "학생") {
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
