// https://www.acmicpc.net/problem/2583

import java.util.*;
import java.io.*;

public class Main {
	static int n, m;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] data;
	static boolean[][] visited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		data = new int[n][m];
		visited = new boolean[n][m];
		
		List<Integer> result = new ArrayList<>();
		for (int K=0; K<k; K++) {
			st = new StringTokenizer(br.readLine());
			int sy = Integer.parseInt(st.nextToken());
			int sx = Integer.parseInt(st.nextToken());
			int ey = Integer.parseInt(st.nextToken()) - 1;
			int ex = Integer.parseInt(st.nextToken()) - 1;
			for (int i=sx; i<ex+1; i++) {
				for (int j=sy; j<ey+1; j++) {
					data[i][j] = 1;
				}
			}
		}
		
		// 분리 영역 구하기
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (data[i][j] == 0 && visited[i][j] == false) {
					result.add(bfs(i, j));
				}
			}
		}
		
		Collections.sort(result);
		System.out.println(result.size());
		for (int i=0; i<result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}
	
	public static int bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		int[] start = {r, c};
		q.add(start);
		visited[r][c] = true;
		int count = 1;
		
		while (q.isEmpty() == false) {
			int[] pop = q.remove();
			int x = pop[0];
			int y = pop[1];
			
			for (int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (!(0 <= nx && nx < n && 0 <= ny && ny < m)) 
					continue;
				if (data[nx][ny] == 1)
					continue;
				
				if (data[nx][ny] == 0 && visited[nx][ny] == false) {
					visited[nx][ny] = true;
					int[] push = {nx, ny};
					q.add(push);
					count ++;
				}
			}
		}
		
		return count;
	}
}

/*
1. 입력받은 크기만큼의 2차원 data 배열과 방문여부를 확인할 수 있는 2차원 visited 배열, (상, 하, 좌, 우) 방향을 담은 dx, dy 배열을 정의한다.
 
2. 개인적으로 편리하게 배열을 정의하기 위해 (시작점y, 시작점x, 끝점y, 끝점x) 순으로 값을 입력받는다. 즉, 문제에서 제시한 그림의 상하 반전으로 표현된다.
 
3. 끝점의 경우 입력받은 값을 그대로 사용하면 index out of range가 발생하므로 1을 감소시킨다.
 
4. 이후 입력받은 좌표로 구성되는 직사각형 모양의 값들을 1로 갱신한다.
 
5. k개의 작업을 완료한 후 분리 영역을 구하는데, 한 칸씩 확인하여 그 값이 0이고 아직 방문하지 않았다면 bfs() 함수를 호출하여 반환받은 값을 result리스트에 추가한다.
 
6.bfs() 함수의 작업은 아래와 같다.
  - Queue()를 정의하여 (r, c) 값을 q에 할당하고 방문 처리를 해준 뒤 해당 영역에 존재하는 칸의 개수를 위해 count를 1로 초기화 한다.
  - q가 빌 때까지 좌표를 하나씩 꺼내 각 방향에 대한 다음 좌표(nx, ny)를 구한다.
  - 다음 좌표가 범위를 벗어나거나 data[nx][ny] 값이 1일 경우 continue한다.
  - 그렇지 않고 data[nx][ny] 값이 0이고 아직 방문하지 않았다면 방문처리를 해주고 q에 좌표 값을 추가한 뒤 count를 1 증가시킨다.
  - while문이 종료되면 count 값을 반환한다.
 
7. 최종적으로 result 리스트를 오름차순으로 정렬한 후 result 리스트에 존재하는 요소의 개수와 값들을 출력한다.

*/
