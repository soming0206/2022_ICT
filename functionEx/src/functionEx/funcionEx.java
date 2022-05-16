package functionEx;

public class funcionEx {
	public static void main(String[] args) {
		String strMessage = "프로그램 시작";
		System.out.println(strMessage);
		System.out.println();

		int firstArg = 25;
		int secondArg = 5;

		int result = funcAdd(firstArg, secondArg); // 더하는 함수 호출
		System.out.println(result);

		int resultM = funcMinus(firstArg, secondArg); // 빼는 함수 호출
		System.out.println(resultM);

		int resultC = funcConv(firstArg, secondArg); // 곱하는 함수 호출
		System.out.println(resultC);

		int resultD = funcDiv(firstArg, secondArg); // 나누는 함수 호출
		System.out.println(resultD);
	}

	static int funcAdd(int a, int b) { // 더하는 함수
		int result = a + b;
		return result;
	}

	static int funcMinus(int c, int d) { // 빼는 함수
		int resultM = c - d;
		return resultM;
	}

	static int funcConv(int i, int j) { // 곱하는 함수
		int resultC = i * j;
		return resultC;
	}

	static int funcDiv(int f, int g) { // 나누는 함수
		int resultD = f / g;
		return resultD;
	}
}
