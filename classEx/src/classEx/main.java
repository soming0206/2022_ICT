package classEx;

public class main {

	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�."); // ���α׷� ���� �޼��� ����
		System.out.println();
		
		Student student1 = new Student();
		Student student2 = new Student("�ҿ�", 4, 1851015);
		
		System.out.println(student1.getStudentName());
		System.out.println(student1.getGrade());
		System.out.println(student1.getStudentId());
		
		System.out.println();
		
		System.out.println(student2.getStudentName());
		System.out.println(student2.getGrade());
		System.out.println(student2.getStudentId());
	}
}
