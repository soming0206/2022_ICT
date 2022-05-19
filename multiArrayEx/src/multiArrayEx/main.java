package multiArrayEx;

public class main {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for(int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				arr[i][j] = (i*5)+(j+1);
				if(arr[i][j] == 6 || arr[i][j] == 11 || arr[i][j] == 16 || arr[i][j] == 21) {
					System.out.println();
				}
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
