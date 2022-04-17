import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

// 1. 이중 for문을 통해 첫째 줄부터 n번째 줄까지 차례대로 별을 출력한다.
