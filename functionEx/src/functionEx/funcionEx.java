package functionEx;

public class funcionEx {
	public static void main(String[] args) {
		String strMessage = "���α׷� ����";
		System.out.println(strMessage);
		System.out.println();

		int firstArg = 25;
		int secondArg = 5;

		int result = funcAdd(firstArg, secondArg); // ���ϴ� �Լ� ȣ��
		System.out.println(result);

		int resultM = funcMinus(firstArg, secondArg); // ���� �Լ� ȣ��
		System.out.println(resultM);

		int resultC = funcConv(firstArg, secondArg); // ���ϴ� �Լ� ȣ��
		System.out.println(resultC);

		int resultD = funcDiv(firstArg, secondArg); // ������ �Լ� ȣ��
		System.out.println(resultD);
	}

	static int funcAdd(int a, int b) { // ���ϴ� �Լ�
		int result = a + b;
		return result;
	}

	static int funcMinus(int c, int d) { // ���� �Լ�
		int resultM = c - d;
		return resultM;
	}

	static int funcConv(int i, int j) { // ���ϴ� �Լ�
		int resultC = i * j;
		return resultC;
	}

	static int funcDiv(int f, int g) { // ������ �Լ�
		int resultD = f / g;
		return resultD;
	}
}
