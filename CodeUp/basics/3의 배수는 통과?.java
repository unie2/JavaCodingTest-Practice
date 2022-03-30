import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();
		for (int i=1; i<=target; i++) {
			if (i % 3 == 0)
				continue;
			System.out.printf("%d ", i);
		}
	}
}

// 1. 1부터 입력받은 target까지 1씩 증가시켜 값을 출력하는데, 현재 확인하고 있는 값이 3의 배수인 경우 continue를 통해 출력하지 않는다.
