import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=n; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

/*
1. 이중 for문을 사용하여 첫째 줄부터 n번째 줄까지 차례대로 별을 출력한다.
2. for (int i=n; i>=1; i--) 과 같이 값을 n부터 1까지 거꾸로 설정하여 진행한다.

*/
