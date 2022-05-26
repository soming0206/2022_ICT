package abstractEx;

public class main {

	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		notebook.turnOn();
		notebook.display();
		notebook.typing();
		notebook.turnoff();
		
		System.out.println("=======================");
		
		Computer computer = new NoteBook();
		computer.turnOn();
		computer.display();
		computer.typing();
		computer.turnoff();
	}

}
