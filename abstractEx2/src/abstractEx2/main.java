package abstractEx2;

public class main {

	public static void main(String[] args) {
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("=========================");
		
		Car newCar = new AICar();
		newCar.run();
	}

}
