package loop;

public class ex03 {

	public static void main(String[] args) {
		// �� ������ ������� ���۸��� �� �����ϰ� �ٽ� Ǯ�����ϴ�
//		int sum = 0;
//		int num = 0;
		
//		while(true) {
//			while(sum<100) {
//				++num; //���ϴ� ������� ���� ������ 1�� ������ �ͺ��� ����
//				//num++;�� ���� �������� �״�� ���� ��
//				if(num % 2 == 0) {
//					sum -= num;
//				}else {
//					sum += num;
//				}
//				System.out.println(num+"�� ��, ���� "+sum);
//			}
//		}
		int sum = 0;
		int count = 0;
		
		while(true) {
			count++;
			if(count % 2 == 1) { //Ȧ���� �� ���ϰ�
				sum += count;
			}
			else if(count % 2 == 0) { //¦���� �� ����
				sum -= count;
			}
			if(sum >= 100) { //�� ���� 100�̻��� �� �� �ݺ��� ������
				break;
			}
		}
		System.out.println("���������� ���� ��: " + count);
		System.out.println("�� �� : " + sum);
	}

}
