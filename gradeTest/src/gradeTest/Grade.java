package gradeTest;

public class Grade {
	//Grade ¸â¹ö º¯¼ö
	int sub1;
	int sub2;
	int sub3;
	
	public Grade(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public int average() {
		int result = (sub1 + sub2 + sub3) / 3;
		return result;
	}
}
