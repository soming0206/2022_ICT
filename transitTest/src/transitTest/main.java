package transitTest;

public class main {

	public static void main(String[] args) {
		People peopleKim = new People("���л�", 19, 10000, "�л�");
		People peopleNa = new People("������", 15, 100, "�л�");
		People peoplePark = new People("������", 32, 1000000, "������");
		People peopleLee = new People("������", 31, 100000, "������");

		peopleKim.takeBus();
		peopleNa.takeSubway();
		peoplePark.takeBus();
		peopleLee.takeSubway();
		

	}

}
