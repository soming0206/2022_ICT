package loop;

public class ex03 {

	public static void main(String[] args) {
		// 이 문제는 어려워서 구글링한 뒤 이해하고 다시 풀었습니당
//		int sum = 0;
//		int num = 0;
		
//		while(true) {
//			while(sum<100) {
//				++num; //원하는 결과물이 기존 변수에 1이 더해진 것부터 원함
//				//num++;은 기존 변수값을 그대로 원할 때
//				if(num % 2 == 0) {
//					sum -= num;
//				}else {
//					sum += num;
//				}
//				System.out.println(num+"일 때, 합이 "+sum);
//			}
//		}
		int sum = 0;
		int count = 0;
		
		while(true) {
			count++;
			if(count % 2 == 1) { //홀수일 때 더하고
				sum += count;
			}
			else if(count % 2 == 0) { //짝수일 때 빼고
				sum -= count;
			}
			if(sum >= 100) { //총 합이 100이상이 될 때 반복문 나오기
				break;
			}
		}
		System.out.println("마지막으로 더한 값: " + count);
		System.out.println("총 합 : " + sum);
	}

}
