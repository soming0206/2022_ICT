package arrayEx;

public class main {

	public static void main(String[] args) {
		System.out.println("arrayEx ���α׷� ����");
		
		/*
		ù ��° ���� ���
		int [] arr1 = new int[10];

		�� ��° ���� ���
		int arr2[] =new int[10];
		
		�� ��° ���� ���
		int arr3[] = new int[]  {0, 1, 2};
		*/
		
		/*
		int[] arr = new int[3];  //int[] arr = {0, 1, 2};
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		*/
		
		/*
		int arr[] = new int[100]; //int �ڷ��� 100���� ���� �迭 ����
		for(int i=0; i<100; i++) { //�迭�� ���ҿ� ���� (100���� ���� ���ǽ� �ۼ�)
			arr[i] = i+1;
		}
		for(int i = 0; i<100; i++) { //�迭�� ���� ���  (100���� ���� ���ǽ� �ۼ�)
			System.out.println(arr[i]);
		}
		
		System.out.println("\n while�ݺ������� �迭 ���� ���� �� ���");
		int j = 0;
		while(j<100) {
			arr[j] = j;
			System.out.println(arr[j]);
			j++;
		}
		*/
		
		/*
		char[] arr = new char[10];
		int j = 65;
		for(int i = 0; i<10; i++) {
			arr[i] = (char)j++;
			System.out.print(arr[i]);
		}
		*/
		
		double[] data = new double[5];

		data[0] =  10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
