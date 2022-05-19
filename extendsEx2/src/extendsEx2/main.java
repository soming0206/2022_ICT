package extendsEx2;

public class main {

	public static void main(String[] args) {
		Developer dev = new Developer("개발자", 10, "대전", 1);
		dev.showInfo();
		dev.showInfoLang();
		
		Police police = new Police("경찰", 10, "대전", 1);
		police.showInfoCareer();
	}
}
