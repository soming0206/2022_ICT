package transitTest;

public class People {
	//¸â¹öº¯¼ö
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
			this.price -= price;
			return true;
		}
	}
	
	public void takeBus() {
		Bus bus = Bus.getInstance();
		bus.takeBus(this);
		if(this.job == "Á÷ÀåÀÎ") {
			if(this.price < 1250) {
				System.out.println("---------------------------");
				System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
				System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
				System.out.println("¹ö½º¿¡ Åº »ç¶÷ ¼ö : " + bus.passangers);
				System.out.println("¹ö½º°¡ ¹ø ¼öÀÔ : " + bus.price);
				System.out.println("---------------------------");
			}
			else {
			payFee(1250);
			System.out.println("---------------------------");
			System.out.println("»ßºò! Á÷ÀåÀÎÀÔ´Ï´Ù.");
			System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
			System.out.println("¹ö½º°¡ ¹ø ¼öÀÔ : " + bus.price);
			System.out.println("¹ö½º¿¡ Åº »ç¶÷ ¼ö : " + bus.passangers);
			System.out.println("---------------------------");
			}
		}
		else if(this.job == "ÇÐ»ý") {
			if(this.price < 720) {
				System.out.println("---------------------------");
				System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
				System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
				System.out.println("¹ö½º°¡ ¹ø ¼öÀÔ : " + bus.price);
				System.out.println("¹ö½º¿¡ Åº »ç¶÷ ¼ö : " + bus.passangers);
				System.out.println("---------------------------");
			} else {
				payFee(720);
				System.out.println("---------------------------");
				System.out.println("»ßºò! ÇÐ»ýÀÔ´Ï´Ù.");
				System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
				System.out.println("¹ö½º°¡ ¹ø ¼öÀÔ : " + bus.price);
				System.out.println("¹ö½º¿¡ Åº »ç¶÷ ¼ö : " +bus.passangers);
				System.out.println("---------------------------");
			}
		}
	}
	
	public void takeSubway() {
		Subway subway = Subway.getInstance();
		subway.takeSubway(this);
		if(this.job == "Á÷ÀåÀÎ") {
			if(this.price < 1250) {
				System.out.println("---------------------------");
				System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
				System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
				System.out.println("ÁöÇÏÃ¶ÀÌ ¹ø ¼öÀÔ : " + subway.price);
				System.out.println("ÁöÇÏÃ¶¿¡ Åº »ç¶÷ ¼ö : " + subway.passangers);
				System.out.println("---------------------------");
			}
			else {
			payFee(1250);
			System.out.println("---------------------------");
			System.out.println("»ßºò! Á÷ÀåÀÎÀÔ´Ï´Ù.");
			System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
			System.out.println("ÁöÇÏÃ¶ÀÌ ¹ø ¼öÀÔ : " + subway.price);
			System.out.println("ÁöÇÏÃ¶¿¡ Åº »ç¶÷ ¼ö : " + subway.passangers);
			System.out.println("---------------------------");
			}
		}
		else if(this.job == "ÇÐ»ý") {
			if(this.price < 720) {
				System.out.println("---------------------------");
				System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
				System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
				System.out.println("ÁöÇÏÃ¶ÀÌ ¹ø ¼öÀÔ : " + subway.price);
				System.out.println("ÁöÇÏÃ¶¿¡ Åº »ç¶÷ ¼ö : " + subway.passangers);
				System.out.println("---------------------------");
			} 
			else {
				payFee(720);
				System.out.println("---------------------------");
				System.out.println("»ßºò! ÇÐ»ýÀÔ´Ï´Ù.");
				System.out.println(this.name + "´ÔÀÇ ÀÜ¾× : " + this.price + "¿ø");
				System.out.println("ÁöÇÏÃ¶ÀÌ ¹ø ¼öÀÔ : " + subway.price);
				System.out.println("ÁöÇÏÃ¶¿¡ Åº »ç¶÷ ¼ö : " + subway.passangers);
				System.out.println("---------------------------");
			}
		}
	}
	
	
}
