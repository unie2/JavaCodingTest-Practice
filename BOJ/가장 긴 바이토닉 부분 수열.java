import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n];
		String[] str = br.readLine().split(" ");
		int[] increase = new int[n];
		int[] decrease = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = Integer.parseInt(str[i]);
			increase[i] = 1;
			decrease[i] = 1;
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				if (data[j] < data[i]) {
					increase[i] = Math.max(increase[i], increase[j] + 1);
				}
			}
		}
		
		for (int i=n-1; i>=0; i--) {
			for (int j=n-1; j>i; j--) {
				if (data[j] < data[i]) {
					decrease[i] = Math.max(decrease[i], decrease[j] + 1);
				}
			}
		}
		
		int result = 0;
		for (int i=0; i<n; i++) {
			result = Math.max(result, increase[i] + decrease[i] - 1);
		}
		
		System.out.println(result);
	}
}

/*
1. 증가하는 수열의 길이와 감소하는 수열의 길이를 각각 구하기 위해 increase와 decrease를 n 크기 만큼 1로 초기화한다.
2. 두 번째 2중 for문을 통해 각 인덱스를 기준으로 증가하는 수열의 길이를 구한다.
3. 세 번째 2중 for문을 통해 각 인덱스를 기준으로 감소하는 수열의 길이를 구한다. 여기서는 값을 거꾸로 확인한다.
4. 증가하는 수열의 특정 인덱스값과 감소하는 수열의 특정 인덱스값을 더하고, 특정 기준 값이 중복되므로 1을 빼준 후 result 값과 비교하여 더 큰 값을 result에 갱신한다.
5. 최대값 갱신 작업을 마치면 최종적으로 result 값을 출력한다.

*/
