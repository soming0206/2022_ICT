package loop;

public class ex04 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		int num2 = 1;
		int sum2 = 0;
		
		while((sum+num) <= 100) {
			num += 1;
			sum += num;
		}
		System.out.println(num);
		System.out.println(sum);
		
		
		System.out.println("======================================");
		
		while(sum2 < 100) {
			num2++;
			sum2 += num2;
		}
		
		num2--;
		sum2 -= num2;
		
		System.out.println(num2);
		System.out.println(sum2);
	}

}
