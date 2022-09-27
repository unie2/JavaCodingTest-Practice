// https://www.acmicpc.net/problem/2636


import java.util.*;
import java.io.*;

public class Main {
	static int n, m;
	static int[][] data;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static List<Integer> cheese_cnt = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		data = new int[n][m];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int time = 0;
		while (true) {
			int cnt = bfs();
			if (cnt == 0)
				break;
			
			time ++;
		}
		
		System.out.println(time);
		System.out.println(cheese_cnt.get(cheese_cnt.size()-2));
	}
	
	public static int bfs() {
		boolean[][] visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList<>();
		int[] push = {0, 0};
		q.add(push);
		int count = 0;
		
		while (q.isEmpty() == false) {
			int[] pop = q.remove();
			int x = pop[0];
			int y = pop[1];
			
			for (int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (!(0 <= nx && nx < n && 0 <= ny && ny < m)) 
					continue;
				if (visited[nx][ny] == false) {
					if (data[nx][ny] == 0) {
						visited[nx][ny] = true;
						int[] temp = {nx, ny};
						q.add(temp);
					} else if (data[nx][ny] == 1) {
						visited[nx][ny] = true;
						data[nx][ny] = 0;
						count ++;
					}
				}
			}
		}
		
		cheese_cnt.add(count);
		return count;
	}
}

/*
1. 각 좌표의 (상, 하, 좌, 우) 방향의 좌표를 확인하기 위해 dx, dy 배열을 정의한다.
 
2. 격자판에 존재하는 치즈의 개수가 0이 될 때까지 while문을 반복 수행하며, 그 내부에서는 bfs()함수를 수행하고 시간(time)을 1 증가시킨다.
 
3. bfs() 함수의 작업은 아래와 같다.
  - 방문 여부를 확인할 수 있는 2차원 visited 배열을 정의한다.
  - Queue()를 정의하고 (0, 0) 좌표 값을 q에 추가한 후 방문 처리를 해준다.
  - q가 빌 때까지 q에서 좌표를 하나 꺼내고 네 가지 방향에 대하여 확인하는데, 각 방향의 다음 좌표 값이 격자판 범위를 벗어난다면 continue한다.
  - 범위를 벗어나지 않는다면 해당 좌표의 방문 여부를 확인하고, 만약 아직 방문하지 않았고 치즈가 없는 칸이라면 방문 처리를 해준 뒤 q에 (nx, ny) 좌표를 추가한다.
  - (nx, ny) 좌표를 아직 방문하지 않았고 치즈가 있는 칸이라면 해당 좌표의 값을 0으로 갱신해주고 방문 처리를 해준 뒤 count 값을 1 증가시킨다.
 
  - while문 작업이 종료되면 cheese_cnt 리스트에 치즈의 개수(count)를 추가하고 count 값을 반환한다.
 
4. 최종적으로 while문이 종료되면 time 값과 치즈가 모두 녹기 한 시간 전에 남아있는 치즈조각의 개수(cheese_cnt[길이-2])를 출력한다.

*/
