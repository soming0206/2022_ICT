package extendsEx2;

public class Person {
	protected String name;
	protected int age;
	protected  String address;
	protected int lang;
	protected int career;
	
	public Person() {

	}
	
	public void showInfo() {
		System.out.println(name + " " + age + " " + address + " " + lang + " " + career);
	}
	
	public void showInfoLang() {
		System.out.println(this.name + "�� ��� ������ ���� " + this.lang);
	}
	
	public void showInfoCareer() {
		System.out.println(this.name + "�� ����� " + this.career);
	}
}
