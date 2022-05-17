package arrayEx;

public class main {

	public static void main(String[] args) {
		System.out.println("arrayEx 프로그램 시작");
		
		/*
		첫 번째 선언 방법
		int [] arr1 = new int[10];

		두 번째 선언 방법
		int arr2[] =new int[10];
		
		세 번째 선언 방법
		int arr3[] = new int[]  {0, 1, 2};
		*/
		
		/*
		int[] arr = new int[3];  //int[] arr = {0, 1, 2};
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		*/
		
		/*
		int arr[] = new int[100]; //int 자료형 100개를 가진 배열 선언
		for(int i=0; i<100; i++) { //배열의 원소에 접근 (100개에 따른 조건식 작성)
			arr[i] = i+1;
		}
		for(int i = 0; i<100; i++) { //배열의 원소 출력  (100개에 따른 조건식 작성)
			System.out.println(arr[i]);
		}
		
		System.out.println("\n while반복문으로 배열 원소 접근 및 출력");
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
