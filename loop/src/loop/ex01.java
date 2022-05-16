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
//			gob = 0; //루프 한번 끝낸 후 gob을 0으로 초기화
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
