package singletonEx;

public class Singleton {
	private static Singleton instance;  //static으로 Singleton 껍떼기 만듦
	
	private Singleton() { //인스턴스 하나만 만들 수 있게하려고 private으로 선언
		System.out.println("기본 생성자 호출");
	}
	
	public static Singleton getInstance() { //자기 자신을 반환하겠다
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
