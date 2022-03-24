import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		for (int i=1; i<=value; i++) {
			if (i % 3 == 0)
				System.out.print("X ");
			else
				System.out.print(i + " ");
		}
	}
}

// 1. 문제에서 요구되는 입력값은 10보다 작은 정수로 제한되어 있으므로, 단순히 3의 배수만 X로 출력하도록 한다.
