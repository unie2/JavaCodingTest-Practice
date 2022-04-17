import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=n-i; j<n; j++) {
				System.out.print(" ");
			}
			for (int j=i; j<n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

// 1. 하나의 반복문 내에 for문을 두개 삽입해줌으로써 첫째 줄부터 n번째 줄까지 차례대로 별을 출력한다.
