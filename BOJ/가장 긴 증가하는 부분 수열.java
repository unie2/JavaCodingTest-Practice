import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n];
		int[] dp = new int[n];
		String[] str = br.readLine().split(" ");
		for (int i=0; i<n; i++)
			data[i] = Integer.parseInt(str[i]);
		
		for (int i=0; i<n; i++)
			dp[i] = 1;
		
		int result = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				if (data[j] < data[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			if (dp[i] > result)
				result = dp[i];
		}
		System.out.println(result);
	}
}

/*
1. 증가하는 수열을 바탕으로 가장 첫번째 요소는 자기 자신 포함하여 1이므로, dp 배열을 1로 초기화 한다.
2. 이중 for문을 통해 현재 확인하고 있는 값과 그 이전에 있는 값들을 하나씩 확인하여 이전 값이 더 작을 경우 dp[i]와 dp[j]+1 값을 비교하여 더 큰 값을 dp[i]에 갱신한다.
3. 반복문이 모두 종료되면 dp 배열에서 가장 큰 값을 출력한다.

*/
