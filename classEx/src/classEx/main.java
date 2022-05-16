package classEx;

public class main {

	public static void main(String[] args) {
		System.out.println("프로그램이 시작되었습니다."); // 프로그램 시작 메세지 출현
		System.out.println();
		
		Student student1 = new Student();
		Student student2 = new Student("소연", 4, 1851015);
		
		System.out.println(student1.getStudentName());
		System.out.println(student1.getGrade());
		System.out.println(student1.getStudentId());
		
		System.out.println();
		
		System.out.println(student2.getStudentName());
		System.out.println(student2.getGrade());
		System.out.println(student2.getStudentId());
	}
}
