import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int dp[] = new int[12];
		// 1일 때 1
		// 2일 때 2
		// 3일 때 4
		// 4일 때 7
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(solution(dp, n));
		}
	}
	
	public static int solution(int[] dp, int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;
		if (dp[n] != 0)
			return dp[n];
		dp[n] = solution(dp, n-1) + solution(dp, n-2) + solution(dp, n-3);
		return dp[n];
	}
}

/*
1. 테스트 케이스의 개수만큼 반복 작업을 수행하여 각 테스트 케이스마다 solution() 함수를 호출하여 반환받은 값을 출력한다.
2. solution() 함수 내부에서는 아래와 같이 작업한다.
  - n이 1일 경우 1을 반환한다. (1) - 1가지
  - n이 2일 경우 2를 반환한다. (1, 1), (2) - 2가지
  - n이 3일 경우 4를 반환한다. (1, 1, 1), (1, 2), (2, 1), (3) - 4가지
  - dp[n]의 값이 0이 아닐 경우 dp[n]을 반환한다.
  - 모든 조건이 만족하지 않는다면 갱신처리가 되지 않았으므로 solution() 함수를 재귀 호출하여 이전의 세 개의 값을 더하여 dp[n]에 저장하고, 반환한다.

*/
