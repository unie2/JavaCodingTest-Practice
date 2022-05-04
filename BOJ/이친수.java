// 1일 때 1
// 2일 때 1
// 3일 때 2
// 4일 때 3
// 5일 때 5
// 6일 때 8
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long dp[] = new long[n + 1];
		System.out.println(solution(dp, n));
	}
	
	public static long solution(long[] dp, int n) {
		if (n == 1 || n == 2)
			return 1;
		if (dp[n] != 0)
			return dp[n];
		dp[n] = solution(dp, n-1) + solution(dp, n-2);
		return dp[n];
	}
}

/*
1. 아래의 두가지 성질을 만족하는 n자리 이친수의 개수는 1가지, 1가지, 2가지, 3가지, 5가지, ... 이다.
  - 이친수는 0으로 시작하지 않는다.
  - 이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
2. 즉, 0101, 011 와 같은 형태는 이친수가 될 수 없다.
3. n이 주어졌을 때, n자리 이친수의 개수는 dp 테이블의 이전 요소 두 값의 합임을 알 수 있다.

*/
