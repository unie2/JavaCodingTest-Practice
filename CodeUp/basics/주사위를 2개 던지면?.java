import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.println(i + " " + j);
			}
		}
	}
}

// 1. 이중 for문을 통해 1부터 n까지, 1부터 m까지의 수 중 나올 수 있는 모든 경우를 출력한다.
