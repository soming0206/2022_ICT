package condition02;

public class ex {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			//���ǽ�
			if(i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}
		}
		//����� ���
		System.out.println(sum);
	}
}
