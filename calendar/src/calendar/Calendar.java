package calendar;
import java.util.Scanner;


public class Calendar {

	public static void main(String[] args) {
		Scanner year = new Scanner(System.in); //���� �Է¹ޱ�
		Scanner month = new Scanner(System.in); //�� �Է¹ޱ�
		
		System.out.println("������ �Է��ϼ���: ");
		int y = year.nextInt();
		System.out.println("���� �Է��ϼ���: ");
		int m = month.nextInt();
		
		int endDays = 0;
		switch(m) {
		case 1:
			endDays = 31;
			break;
		case 2:
			if(y%4 == 0 && y%100 != 0 || y%400 == 0) { //������ ��
				endDays = 29;
			}else { //����� ��
				endDays = 28;
			}
			break;
		case 3:
			endDays = 31;
			break;
		case 4: 
			endDays = 30;
			break;
		case 5:
			endDays = 31;
			break;
		case 6:
			endDays = 30;
			break;
		case 7: 
			endDays = 31;
			break;
		case 8:
			endDays = 31;
			break;
		case 9:
			endDays = 30;
			break;
		case 10:
			endDays = 31;
			break;
		case 11:
			endDays = 30;
			break;
		case 12:
			endDays = 31;
			break;
	
		}
		System.out.println();
		System.out.println(y + "�� " + m +"�� " + "������ ��: " + endDays);
		for(int date = 1; date<=endDays; date++) {
			if(date%7==0) {
				System.out.println();
			}
			System.out.print(date + " ");
		}
		System.out.println();
	}

}



