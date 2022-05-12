import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] stairs = new int[n+1];
		
		for (int i=1; i<=n; i++)
			stairs[i] = Integer.parseInt(br.readLine());
		
		if (n == 1)
			System.out.println(stairs[1]);
		else {
			int[] dp = new int[n+1];
			dp[1] = stairs[1];
			dp[2] = stairs[2] + stairs[1];
			
			for (int j=3; j<=n; j++) {
				dp[j] = Math.max(dp[j-3]+stairs[j-1]+stairs[j], dp[j-2]+stairs[j]);
			}
			
			System.out.println(dp[n]);
		}
	}
}

/*
1. 입력받은 n개의 수를 stairs 배열에 각 인덱스에 맞도록 하여 추가한다.
2. 만약 입력받은 n이 1일 경우 단순히 stairs의 1번째 요소를 출력한다.
3. 그렇지 않을 경우 dp배열을 정의하고, 1번째 요소에 stairs[1]을, 2번째 요소에 stairs[2]+stairs[1]을 할당한다.
4. 반복문을 통해 dp배열의 3번째 요소부터 값을 갱신해 나아간다.
5. 갱신 시, 연속된 세 개의 계단을 모두 밟으면 안되므로, dp[j-3]+stairs[j-1]+stairs[j] 와 dp[j-2]+stairs[j]를 비교하여 더 큰 값으로 갱신한다.
6. 반복문이 종료되면 최종적으로 dp배열의 n번째 요소를 출력한다.

*/
