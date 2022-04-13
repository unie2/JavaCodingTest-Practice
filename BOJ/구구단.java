import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
	}
}

// 1. n을 입력받은 후 1부터 9까지를 범위로 지정하여 반복문을 수행함으로써 구구단 n단을 문제에서 요구하는 출력 형식에 맞추어 출력한다.
