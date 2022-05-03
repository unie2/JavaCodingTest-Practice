import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[][] = new int[n+1][11];
		
		for (int i=0; i<10; i++) 
			dp[1][i] = 1;
		
		for (int i=2; i<=n; i++) {
			for (int j=0; j<10; j++) {
				if (j == 0)
					dp[i][j] = dp[i-1][0] % 10007;
				else 
					dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 10007;
			}
		}
		
		int result = 0;
		for (int i=0; i<10; i++) 
			result += dp[n][i];
		
		System.out.println(result % 10007);
	}
}

/*
1. 2차원 리스트로 dp 테이블을 정의한다.
2. 첫번째 요소 내 10개의 값은 1로 갱신해준다.
3. 이중 for문을 통해 dp리스트의 값들을 갱신해주는데, 열(j)의 인덱스가 가장 처음(0)일 경우 dp[i-1][0]으로 갱신한다.
4. 인덱스가 0이 아닐 경우 바로 왼쪽에 있는 값(dp[i][j-1])과 바로 위쪽에 있는 값(dp[i-1][j])을 더한 값으로 갱신한다.
5. 이와 같은 작업을 모두 마치면, 오르막 수의 개수를 구해야하므로 반복문을 통해 dp[n][i]의 값을 result에 누적하여 최종적으로 10007으로 나눈 나머지 값을 출력한다.

*/
