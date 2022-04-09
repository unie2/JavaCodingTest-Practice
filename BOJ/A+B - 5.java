import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			
			System.out.println(a + b);
		}
	}
}

// 1. 두 정수 a와 b를 입력받은 후 a + b 값을 출력한다. 이러한 작업을 입력받은 a와 b가 모두 0일 때까지 반복 수행한다.
