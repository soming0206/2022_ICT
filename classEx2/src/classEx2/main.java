package classEx2;

public class main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Recipe recipe;
		
		Recipe recipe2 = new Recipe();
		recipe2.setSource(2);
		System.out.println(recipe2.getSource());
		
		recipe = recipe2; //클래스안에 클래스 대입
		System.out.println(recipe.getSource());
	}
}
