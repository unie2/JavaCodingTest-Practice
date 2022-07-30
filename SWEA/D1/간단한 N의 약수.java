import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

// 1. 1부터 입력받은 값까지를 반복문의 범위로 설정하고, 만약 i가 n의 약수일 경우 i를 출력한다.
