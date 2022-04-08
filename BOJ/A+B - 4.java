import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
	}
}

/*
1. 입력이 여러 개의 테스트 케이스로 이루어져 있으므로, while문에서 단순히 a와 b를 입력받아 출력한다면 런타임 에러가 발생한다.
2. 이를 해결하기 위해 hasNextInt() 혹은 hasNext()를 포함시켜 예외 처리를 수행한다.
3. hasNextInt()는 입력 값이 정수일 경우 true를 반환하고, 정수가 아닐 경우에는 예외를 발생시켜 더이상의 입력을 받지 않고 false를 반환하면서 반복문을 종료시킨다.

*/
