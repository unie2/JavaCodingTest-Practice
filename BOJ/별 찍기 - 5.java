import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for (int j=n-i; j<n; j++) {
				System.out.print('*');
			}
			for (int j=n-i+1; j<n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

// 1. 하나의 반복문 내에 for문을 세개 삽입해줌으로써 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*n-1개를 출력한다.
