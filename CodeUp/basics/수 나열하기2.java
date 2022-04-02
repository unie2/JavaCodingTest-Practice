import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(a * (long)(Math.pow(r, n - 1)));
	}
}

// 1. 공비가 r인 등비수열의 공식을 활용해 n번째 수를 출력한다.
