package star2;

public class ex1 {
		public static void main(String[] args) {		
	        for(int i = 0; i<6; i++) {
	        	for(int j = 0; j<10; j++) {
	        		if(i+j <= 5 || i-j <= -5) {
	        			System.out.print(" ");
	        		}else {
	        			System.out.print("*");
	        		}
	        	}
	        	System.out.println();
	        }
		}
}
