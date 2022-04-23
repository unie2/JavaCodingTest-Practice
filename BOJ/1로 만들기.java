import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int data[] = new int[n + 1];
		
		for (int i=2; i<=n; i++) {
			data[i] = 1 + data[i-1];
			
			if (i % 3 == 0)
				data[i] = Math.min(data[i], data[i/3] + 1);
			if (i % 2 == 0)
				data[i] = Math.min(data[i], data[i/2] + 1);
		}
		
		System.out.println(data[n]);
	}
}

/*
1. n이 3으로 나누어 떨어지면, 3으로 나눈다.
2. n이 2로 나누어 떨어지면, 2로 나눈다.
3. 1을 뺀다.
4. 위 세가지의 방법을 모두 하나씩 진행하여 최솟값을 구해 dp 리스트에 담는 방식으로 진행한다.

*/
