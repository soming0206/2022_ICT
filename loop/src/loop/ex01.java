package loop;

public class ex01 {
	public static void main(String[] args) {
//		int dan = 2;
//		int gob = 0;
//		
//		while(dan < 10) {
//			while(gob < 9) {
//				gob++;
//				System.out.println(dan + "*" + gob + "=" + dan*gob);
//			}
//			gob = 0; //���� �ѹ� ���� �� gob�� 0���� �ʱ�ȭ
//			dan++;
//		}
		
		int dan = 2;
		while(dan<10) {
			int gob = 1;
			while(gob<10) {
				System.out.println(dan + "*" + gob + "=" + dan*gob);
				gob++;
			}
			dan++;
		}
	}
}
