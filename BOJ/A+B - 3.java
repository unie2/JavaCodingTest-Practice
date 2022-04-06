import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
	}
}

/*
1. 테스트 케이스의 개수 t를 입력받아 t번의 반복 작업을 수행한다.
2. 반복문 내부에서는 두 정수 a와 b를 입력받은 후 a + b 값을 출력한다.

*/
