package transitTest;

public class People {
	//????????
	String name;
	int age;
	int price;
	String job;
	
	public People(String name, int age, int price, String job) {
		this.name = name;
		this.age = age;
		this.price= price;
		this.job = job;
	}
	
	public boolean payFee(int price) {
		if(this.price < price) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void takeBus() {
		Bus bus = Bus.getInstance();
		bus.takeBus(this);
		if(this.job == "??????") {
			if(this.price < 1250) {
				System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
				System.out.println("?????? ź ???? ?? : " + bus.passengers);
				System.out.println("?????? ?? ???? : " + bus.price);
				System.out.println("---------------------------");
			}
			else {
			payFee(1250);
			System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
			System.out.println("?????? ?? ???? : " + bus.price);
			System.out.println("?????? ź ???? ?? : " + bus.passengers);
			System.out.println("---------------------------");
			}
		}
		else if(this.job == "?л?") {
			if(this.price < 720) {
				System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
				System.out.println("?????? ?? ???? : " + bus.price);
				System.out.println("?????? ź ???? ?? : " + bus.passengers);
				System.out.println("---------------------------");
			} else {
				payFee(720);
				System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
				System.out.println("?????? ?? ???? : " + bus.price);
				System.out.println("?????? ź ???? ?? : " +bus.passengers);
				System.out.println("---------------------------");
			}
		}
	}
	
	public void takeSubway() {
		Subway subway = Subway.getInstance();
		subway.takeSubway(this);
		if(this.job == "??????") {
			if(this.price < 1250) {
				System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
				System.out.println("????ö?? ?? ???? : " + subway.price);
				System.out.println("????ö?? ź ???? ?? : " + subway.passengers);
				System.out.println("---------------------------");
			}
			else {
			payFee(1250);
			System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
			System.out.println("????ö?? ?? ???? : " + subway.price);
			System.out.println("????ö?? ź ???? ?? : " + subway.passengers);
			System.out.println("---------------------------");
			}
		}
		else if(this.job == "?л?") {
			if(this.price < 720) {
				System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
				System.out.println("????ö?? ?? ???? : " + subway.price);
				System.out.println("????ö?? ź ???? ?? : " + subway.passengers);
				System.out.println("---------------------------");
			} 
			else {
				payFee(720);
				System.out.println(this.name + "???? ?ܾ? : " + this.price + "??");
				System.out.println("????ö?? ?? ???? : " + subway.price);
				System.out.println("????ö?? ź ???? ?? : " + subway.passengers);
				System.out.println("---------------------------");
			}
		}
	}
	
	
}
