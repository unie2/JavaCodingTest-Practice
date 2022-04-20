import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = n - 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=count; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print('*' + " ");
			}
			System.out.println();
			count --;
		}
	}
}

// 1. 입력받은 수를 바탕으로 반복문을 통해 문제에서 요구하는 출력형식에 맞추어 별을 출력한다.
