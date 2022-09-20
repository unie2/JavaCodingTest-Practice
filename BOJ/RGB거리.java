import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] data = new int[n][3];
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<3; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=1; i<n; i++) {
			data[i][0] = Math.min(data[i-1][1], data[i-1][2]) + data[i][0];
			data[i][1] = Math.min(data[i-1][0], data[i-1][2]) + data[i][1];
			data[i][2] = Math.min(data[i-1][0], data[i-1][1]) + data[i][2];
		}
		
		System.out.println(Math.min(Math.min(data[n-1][0], data[n-1][1]), data[n-1][2]));
	}
}

/*
1. 다이나믹 프로그래밍을 통해 문제를 해결할 수 있다.
2. 1부터 n까지를 반복문의 범위로 설정하여 각 data[i][x]에 이전 좌표에서 가능한 인덱스의 최소값과 현재 좌표의 최소값을 더하여 갱신한다.
3. 최종적으로 마지막 인덱스의 0번째, 1번째, 2번째 값 중 최솟값을 출력한다.

*/
