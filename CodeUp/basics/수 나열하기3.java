import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		for (int i=1; i<n; i++)
			a = (a * m) + d;

		System.out.println(a);
	}
}

/*
1. 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)을 입력받은 후 시작 값부터 시작하여 m을 곱한 다음 d를 더해 나간다.
2. 최종적으로 문제에서 요구하는 바와 같이 n번째 수를 의미하는 a를 출력한다.

*/
