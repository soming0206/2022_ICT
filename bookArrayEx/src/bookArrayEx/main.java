package bookArrayEx;

public class main {

	public static void main(String[] args) {
		/*
		Book[] library = new Book[5];
		
		library[0] = new Book("해리포터", "J.K.롤링");
		library[1] = new Book("정의란 무엇인가", "마이클 샌델");
		library[2] = new Book("Do it java 프로그래밍", "박은종");
		library[3] = new Book("어린왕자", "생텍쥐페리");
		library[4] = new Book("괭이 부리말 아이들", "김중미");
		
		for(int i = 0; i<library.length; i++) {
			System.out.println("==========================");
			System.out.println("책 이름: " + library[i].getBookName());
			System.out.println("책 저자: " + library[i].getAuthor());
			System.out.println("==========================");
			}
			*/
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("책1", "저자1");
		bookArray1[1] = new Book("책1", "저자1");
		bookArray1[2] = new Book("책1", "저자1");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		
		/*
		for(int i =0; i<bookArray2.length; i++) {
			System.out.print(bookArray2[i].bookName + ", ");
			System.out.println(bookArray2[i].author);
		}
		*/
		
		//얕은 복사
		bookArray1[0].setBookName("다른책1");
		bookArray1[0].setAuthor("다른 저자1");
		
		System.out.print(bookArray2[0].bookName + ", ");
		System.out.println(bookArray2[0].author);
	}

}
