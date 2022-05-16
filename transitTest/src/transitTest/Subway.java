package transitTest;

public class Subway {
	private static Subway instance;
	
	int price;
	int studentPrice = 720;
	int workerPrice = 1250;
	int passengers;
	
	private Subway() {
		System.out.println("===����ö ���� ����===");
	}
	
	public static Subway getInstance() {
		if(instance == null) {
			instance = new Subway();
		}
		return instance;
	}
	
//	public void takeSubway(People people) {
//		if(people.job == "������") {
//			this.price += this.workerPrice;
//			passengers++;
//			if(people.price <this.workerPrice) {
//				passengers -= passengers;
//			}
//		}
//		if(people.job == "�л�") {
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
		case "������" :
			if(people.payFee(workerPrice) ) {
				System.out.println("�ߺ�! �������Դϴ�.");
				price += workerPrice;
				people.price -= workerPrice;
				passengers++;
			}
			else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			break;
			
		case "�л�" :
			if(people.payFee(studentPrice) ) {
				System.out.println("�ߺ�! �л��Դϴ�.");
				price += studentPrice;
				people.price -= studentPrice;
				passengers++;
			}
			else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			break;
			
			default:
				System.out.println("�߸��� �����Դϴ�.");
		}
	}
}
