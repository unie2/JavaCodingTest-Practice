// https://www.acmicpc.net/problem/7576

import java.util.*;
import java.io.*;

public class Main {
	static int n, m;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] data;
	static Queue<int[]> q = new LinkedList<>();;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		data = new int[n][m];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
				if (data[i][j] == 1) {
					// 익은 토마토
					int[] temp = {i, j};
					q.add(temp);
				}
			}
		}
		
		int result = 0;
		bfs();
		
		for (int i=0; i<n; i++) {
			int max_value = 0;
			for (int j=0; j<m; j++) {
				if (data[i][j] == 0) {
					System.out.println(-1);
					System.exit(0);
				}
				max_value = Math.max(max_value, data[i][j]);
			}
			
			result = Math.max(result, max_value);
		}
		
		System.out.println(result - 1);
	}
	
	public static void bfs() {
		while (q.isEmpty() == false) {
			int[] pop = q.remove();
			int x = pop[0];
			int y = pop[1];
			for (int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (0 <= nx && nx < n && 0 <= ny && ny < m && data[nx][ny] == 0) {
					// 안익은 토마토
					int[] temp = {nx, ny};
					q.add(temp);
					data[nx][ny] = data[x][y] + 1;
				}
			}
		}
	}
}

/*
1. n줄의 창고 상태를 한 줄씩 입력받아 data 배열에 추가하고, 해당 줄의 m개의 토마토 중 익은 토마토의 좌표를 q에 추가한다.
 
2. (상, 하, 좌, 우) 방향을 담은 dx, dy 배열을 정의하고 bfs() 함수를 호출하여 수행한다. bfs() 함수의 작업은 아래와 같다.
  - q가 빌 때까지 좌표를 하나씩 꺼내(x, y) 네 가지 방향에 대한 각 다음 좌표를 확인한다.
  - 다음 좌표가 창고 범위 내에 존재하고 해당 좌표에 있는 토마토가 안익었다면 해당 좌표(nx, ny)를 q에 추가하고 원래의 좌표에 존재하는 data 값에 1을 더한 값을 data[nx][ny]에 할당한다.
 
3. bfs() 함수의 작업이 끝나면 창고 상태를 한 줄씩 확인하고, 안익은 토마토가 있다면 -1을 출력한 후 시스템을 종료한다.
 
4. 한 줄을 확인했을 때 안익은 토마토가 없다면 result값과 현재 줄에 존재하는 최댓값을 비교하여 더 큰 값을 result에 할당한다.
 
5. 반복 작업이 끝나면 최종적으로 result에 1을 뺀 값을 출력한다. (가장 처음 0이 아닌 1부터 시작하였으므로)

*/
