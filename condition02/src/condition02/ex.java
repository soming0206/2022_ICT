package condition02;

public class ex {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			//조건식
			if(i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}
		}
		//결과값 출력
		System.out.println(sum);
	}
}
