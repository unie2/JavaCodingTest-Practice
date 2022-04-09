import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i=1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
		}
	}
}

// 1. 두 정수 a와 b를 입력받은 후 문제에서 요구하는 출력 형식에 맞추어 두 수의 합을 출력한다.
