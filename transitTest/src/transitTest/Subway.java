package transitTest;

public class Subway {
	private static Subway instance;
	
	int price;
	int studentPrice = 720;
	int workerPrice = 1250;
	int passengers;
	
	private Subway() {
		System.out.println("===지하철 최초 생성===");
	}
	
	public static Subway getInstance() {
		if(instance == null) {
			instance = new Subway();
		}
		return instance;
	}
	
//	public void takeSubway(People people) {
//		if(people.job == "직장인") {
//			this.price += this.workerPrice;
//			passengers++;
//			if(people.price <this.workerPrice) {
//				passengers -= passengers;
//			}
//		}
//		if(people.job == "학생") {
//			if(people.price >this.studentPrice) {
//			this.price += this.studentPrice;
//			passengers++;
//			}
//			else {
//				passengers -= passengers;
//			}
//		}
//	}
	public void takeSubway(People people) {
		switch(people.job) {
		case "직장인" :
			if(people.payFee(workerPrice) ) {
				System.out.println("삐빅! 직장인입니다.");
				price += workerPrice;
				people.price -= workerPrice;
				passengers++;
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			break;
			
		case "학생" :
			if(people.payFee(studentPrice) ) {
				System.out.println("삐빅! 학생입니다.");
				price += studentPrice;
				people.price -= studentPrice;
				passengers++;
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			break;
			
			default:
				System.out.println("잘못된 직업입니다.");
		}
	}
}
