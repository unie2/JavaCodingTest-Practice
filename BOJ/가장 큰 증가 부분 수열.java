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
		for (int i=0; i<n; i++) {
			data[i] = Integer.parseInt(str[i]);
			dp[i] = data[i];
		}
		
		int result = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				if (data[j] < data[i]) {
					dp[i] = Math.max(dp[i], dp[j] + data[i]);
				}
			}
			result = Math.max(result, dp[i]);
		}
		System.out.println(result);
	}
}

/*
1. 입력받은 값들을 이루는 dp 배열을 추가로 정의한다.
2. 2중 for문을 통해 특정 값을 기준으로 그 이전값까지 값을 비교하고, 이전에서 확인하고 있는 값이 기준값보다 작을 경우 dp[i] (기준값)와 dp[j] + data[i] (이전값과의 합)을 비교하여 더 큰 값을 dp[i]에 갱신한다.
3. 내부 반복문이 종료되면 현재 result 값과 dp[i]의 값을 비교하여 result에 더 큰 값으로 갱신한다.
4. 반복문이 모두 종료되면 dp 배열에서 가장 큰 값(result)을 출력한다.

*/
