import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum_value = 0;
		for (int i=1; i<=n; i++) {
			sum_value += i;
		}
		System.out.println(sum_value);
	}
}

// 1. n을 입력받아 반복문을 수행하여 1부터 n까지의 합을 구하여 출력한다.
