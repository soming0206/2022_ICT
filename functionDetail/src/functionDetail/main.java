package functionDetail;

public class main {

	public static void main(String[] args) {
		System.out.println("프로그램이 시작되었습니다.");
		Method function = new Method();
		
//		String data = "데이터";
//		function.setData(data, data);
//		System.out.println("main data: " + data);
		
		int num = 10;
		function.setInt(num);
		System.out.println("main setInt: " + num);
	}

}
