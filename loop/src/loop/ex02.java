package loop;

public class ex02 {

	public static void main(String[] args) {

		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(i+j == 6) {
					System.out.println("주사위 눈의 합이 6이 되는 경우" + "(" + i + ") " + i + "," + j);
				}
			}
		}

	}

}
