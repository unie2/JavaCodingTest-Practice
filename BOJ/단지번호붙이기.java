// Case1 - DFS 방식
import java.util.*;

public class Main {
	static int n;
	static char[][] data;
	static int count;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		data = new char[n][n];
		
		for (int i=0; i<n; i++) {
			String temp = sc.next();
			for (int j=0; j<n; j++) {
				data[i][j] = temp.charAt(j);
			}
		}
		
		int total = 0;
		List<Integer> result = new ArrayList<>();
		
		count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (dfs(i, j) == true) {
					total ++;
					result.add(count);
					count = 0;
				}
			}
		}
		
		System.out.println(total);
		Collections.sort(result);
		for (int res : result) {
			System.out.println(res);
		}
	}
	
	public static boolean dfs(int x, int y) {
		if (0 > x || x >= n || 0 > y || y >= n) {
			return false;
		}
		
		if (data[x][y] == '1') {
			data[x][y] = 0;
			count ++;
			
			for (int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				dfs(nx, ny);
			}
			
			return true;
		}
		
		return false;
	}
}

/*
1. 지도 상태를 입력받아 data 2차원 배열에 저장하고, (상, 하, 좌, 우) 방향을 담은 dx, dy 배열을 정의한다.

2. 지도의 각 칸의 상태를 확인하여 dfs() 함수를 호출하고, 반환받은 값이 true일 경우 total을 1 증가시키고, count 값을 result 리스트에 할당한 뒤 count 값을 다시 0으로 초기화한다.

3. 모든 칸에 대한 방문이 끝나면 최종적으로 total과 오름차순으로 정렬된 result 리스트의 값들을 하나씩 출력한다.

4. dfs() 함수의 작업은 아래와 같다.
  - 만약 전달받은 좌표(x, y)가 범위를 벗어나지 않고 data[x][y]가 '1'일 경우 해당 값을 0으로 갱신해주고 count 값을 1 증가시킨다.
  - 이후 네 가지의 방향에 대한 각 좌표 값을 구하여 dfs() 함수에 전달함으로써 재귀호출을 수행한다.
  - 네 가지 방향에 대하여 모두 확인한 뒤 True를 반환한다.
  - 만약 data[x][y]의 값이 '1'이 아닐 경우 False를 반환한다.

*/


// Case2 - BFS 방식
import java.util.*;

public class Main {
	static int n;
	static char[][] data;
	static int count;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		data = new char[n][n];
		
		for (int i=0; i<n; i++) {
			String temp = sc.next();
			for (int j=0; j<n; j++) {
				data[i][j] = temp.charAt(j);
			}
		}
		
		int total = 0;
		List<Integer> result = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (data[i][j] == '1') {
					total ++;
					int count = bfs(i, j);
					result.add(count);
				}
			}
		}
		
		System.out.println(total);
		Collections.sort(result);
		for (int res : result) {
			System.out.println(res);
		}
	}
	
	public static int bfs(int i, int j) {
		List<int[]> list = new ArrayList<>();
		int[] pos = {i, j};
		list.add(pos);
		data[i][j] = 0;
		
		int cnt = 1;
		while (!list.isEmpty()) {
			int[] pop = list.remove(0);
			int x = pop[0];
			int y = pop[1];
			
			for (int d=0; d<4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
					continue;
				}
				
				if (data[nx][ny] == '1') {
					data[nx][ny] = 0;
					cnt ++;
					int[] temp = {nx, ny};
					list.add(temp);
				}
			}
		}
		
		return cnt;
	}
}

/*
1. DFS 방식과 마찬가지로 지도의 상태와 네 가지 방향을 담은 dx, dy 배열을 정의한다.
 
2. 지도의 각 칸을 확인하여 그 값이 '1'일 경우 total을 1 증가시키고, bfs() 함수를 호출하여 반환받은 값을 result 리스트에 추가한다.
 
3. 모든 칸에 대한 확인을 마치면 최종적으로 total과 오름차순으로 정렬된 result 리스트의 값들을 하나씩 출력한다.
 
4. bfs() 함수의 작업은 아래와 같다.
  - 전달받은 좌표(i, j)를 list에 추가한 후 해당 좌표의 값을 0으로 갱신한다.
  - list가 빌 때까지 좌표를 하나씩 꺼내 x, y에 담고, 네 가지 방향에 대한 각 방향의 좌표(nx, ny)를 구한다.
  - 만약 해당 좌표(nx, ny)가 범위를 벗어나지 않고 지도에 담긴 값이 '1'일 경우 해당 좌표의 값을 0으로 갱신해주고 list에 해당 좌표를 추가한 뒤 cnt 값을 1 증가시킨다.
  - list에 담긴 값들에 대한 처리를 모두 끝낸 후 cnt 값을 반환한다.

*/
