package classEx2;

public class main {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Recipe recipe;
		
		Recipe recipe2 = new Recipe();
		recipe2.setSource(2);
		System.out.println(recipe2.getSource());
		
		recipe = recipe2; //Ŭ�����ȿ� Ŭ���� ����
		System.out.println(recipe.getSource());
	}
}
