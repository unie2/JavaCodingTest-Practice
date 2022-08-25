import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int min = 1000000;
		
		for (int i=0; i<n; i++) {
			int value = sc.nextInt();
			max = Math.max(max, value);
			min = Math.min(min, value);
		}
		
		System.out.println(max * min);
	}
}

// 1. 입력받은 값들은 모두 진짜 약수이기 때문에 값들 중 최솟값과 최댓값을 구하여 두 수의 곱을 출력한다.
