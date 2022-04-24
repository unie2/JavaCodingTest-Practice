import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 1일 때 1
		// 2일 때 2
		// 3일 때 3
		// 4일 때 5
		int dp[] = new int[n + 1];
		System.out.println(solution(dp, n));
	}
	
	public static int solution(int[] dp, int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (dp[n] != 0)
			return dp[n];
		dp[n] = (solution(dp, n-1) + solution(dp, n-2)) % 10007;
		return dp[n];
	}
}

/*
1. n + 1 크기의 dp 배열을 선언한 후 solution() 함수를 통해 전달받은 값을 출력한다.
2. solution() 함수 
  - 전달받은 n의 값이 1일 경우 1을 반환하고, 2일 경우 2를 반환한다.
  - 두 조건 모두 만족하지 않는 경우 dp[n]을 확인하여 0이 아닐 경우 그 값을 반환한다.
  - 모든 조건을 만족하지 않는 경우 solution() 함수를 재귀호출하여 dp 배열의 이전 값과 2번째 전 값을 더하고 10007을 나눈 나머지 값을 dp[n]에 저장하여 반환한다.

*/
