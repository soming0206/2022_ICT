package bookArrayEx;

public class main {

	public static void main(String[] args) {
		/*
		Book[] library = new Book[5];
		
		library[0] = new Book("�ظ�����", "J.K.�Ѹ�");
		library[1] = new Book("���Ƕ� �����ΰ�", "����Ŭ ����");
		library[2] = new Book("Do it java ���α׷���", "������");
		library[3] = new Book("�����", "�������丮");
		library[4] = new Book("���� �θ��� ���̵�", "���߹�");
		
		for(int i = 0; i<library.length; i++) {
			System.out.println("==========================");
			System.out.println("å �̸�: " + library[i].getBookName());
			System.out.println("å ����: " + library[i].getAuthor());
			System.out.println("==========================");
			}
			*/
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("å1", "����1");
		bookArray1[1] = new Book("å1", "����1");
		bookArray1[2] = new Book("å1", "����1");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		
		/*
		for(int i =0; i<bookArray2.length; i++) {
			System.out.print(bookArray2[i].bookName + ", ");
			System.out.println(bookArray2[i].author);
		}
		*/
		
		//���� ����
		bookArray1[0].setBookName("�ٸ�å1");
		bookArray1[0].setAuthor("�ٸ� ����1");
		
		System.out.print(bookArray2[0].bookName + ", ");
		System.out.println(bookArray2[0].author);
	}

}
