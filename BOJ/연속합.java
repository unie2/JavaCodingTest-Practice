import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] data = new int[n];
		int[] dp = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = Integer.parseInt(str[i]);
			dp[i] = data[i];
		}
		
		int result = dp[0];
		for (int i=1; i<n; i++) {
			dp[i] = Math.max(dp[i], dp[i-1] + data[i]);
			result = Math.max(result, dp[i]);
		}
		
		System.out.println(result);
	}
}

/*
1. 입력받은 데이터를 이루는 data 배열을 통해 dp 배열을 추가로 정의한다.
2. 연속된 몇 개의 수를 선택해야하므로, 반복문을 통해 dp[i]와 dp[i-1]+data[i]를 비교하여 더 큰 값을 dp[i]에 갱신한다.
   여기서 dp[i-1]은 이전에 갱신되었기 때문에 단순히 dp[i-1] + data[i]를 연산하여 해결할 수 있다.
3. 최종적으로 dp 배열에서 가장 큰 값을 출력한다.
   result의 경우 음수가 들어갈 수 있으므로 0으로 초기화하지 않고 dp 배열의 첫번째(0번째) 값으로 초기화한다.

*/
