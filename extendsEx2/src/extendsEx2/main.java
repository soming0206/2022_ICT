package extendsEx2;

public class main {

	public static void main(String[] args) {
		Developer dev = new Developer("������", 10, "����", 1);
		dev.showInfo();
		dev.showInfoLang();
		
		Police police = new Police("����", 10, "����", 1);
		police.showInfoCareer();
	}
}
