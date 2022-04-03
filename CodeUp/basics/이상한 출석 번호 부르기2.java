import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] k = new int[n];

		for (int i=0; i<n; i++)
			k[i] = sc.nextInt();

		for (int i=n-1; i>=0; i--)
			System.out.print(k[i] + " ");
	}
}

/*
1. 출석 번호를 부른 횟수(n)를 입력받은 후 입력받은 횟수(테스트 케이스)인 n개의 번호를 입력받는다.
2. 문제에서 요구하는 바와 같이 출석을 부른 번호 순서를 바꾸어 출력하기 위해 출력 시 단순히 배열 인덱스를 거꾸로하여 출력한다.

*/
