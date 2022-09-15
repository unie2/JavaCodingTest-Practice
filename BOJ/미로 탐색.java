// https://www.acmicpc.net/problem/2178

import java.util.*;

public class Main {
	static int n, m;
	static int[][] data = new int[101][101];
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			String str = sc.next();
			for (int j=0; j<m; j++) {
				data[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		System.out.println(bfs(0, 0));
	}
	
	public static int bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		int[] temp = {i, j};
		q.add(temp);
		
		while (q.isEmpty() == false) {
			int[] pop = q.remove();
			int x = pop[0];
			int y = pop[1];
			
			for (int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				if (data[nx][ny] == 0)
					continue;
				
				if (data[nx][ny] == 1) {
					data[nx][ny] = data[x][y] + 1;
					int[] put = {nx, ny};
					q.add(put);
				}
			}
		}
		
		return data[n-1][m-1];
	}
}

/*
1. n, m, 미로의 상태판(data) 배열을 입력받은 후 (상, 하, 좌, 우) 방향을 의미하는 dx, dy 배열을 정의한다.

2. bfs() 함수를 호출하여 반환받은 값을 출력하는데, bfs() 함수의 작업은 아래와 같다.
  - 처음 전달받은 i, j 값 (좌표 0, 0)을 Queue에 추가한다.
  - q가 빌 때까지 수행하며, q에 존재하는 값을 꺼내 x, y에 할당한다.
  - 네 가지의 방향을 확인하는데, 각 방향마다 다음 칸을 의미하는 nx, ny를 구한다.
  - nx, ny가 범위를 벗어나거나 미로판에서의 값이 0일 경우 갈 수 없으므로 continue한다.
  - 미로판에서의 값이 1일 경우 갈 수 있으므로 해당 값을 이전 값에서 1을 더한 값으로 갱신한 뒤 q에 (nx, ny) 좌표를 추가한다.
  - q가 비면 data[n-1][m-1]의 값을 반환한다.

*/
