import java.io.*;
import java.util.*;

public class Main {
	static int[][] graph;
	static boolean[] visited;
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		graph = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		dfs(v);
		System.out.println();	
		visited = new boolean[n+1];
		bfs(v);
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		for (int i=1; i<=n; i++) {
			if (!visited[i] && graph[start][i] == 1)
				dfs(i);
		}
	}
	
	public static void bfs(int start) {
		List<Integer> list = new ArrayList<>();
		list.add(start);
		visited[start] = true;
		
		while (list.size() > 0) {
			int node = list.remove(0);
			System.out.print(node + " ");
			for (int i=1; i<=n; i++) {
				if (!visited[i] && graph[node][i] == 1) {
					list.add(i);
					visited[i] = true;
				}
			}
		}
	}
}

/*
1. 정점 수, 간선 수, 시작 번호를 입력받아 특정 노드와 노드의 연결 상태를 나타내는 2차원 graph 배열과 방문 여부를 나타내는 visited 배열을 정의한다.

2. 시작 노드를 dfs() 의 매개변수로 하여 함수를 호출하고, dfs() 함수의 작업은 아래와 같다.
  - 전달받은 노드를 방문 처리해주고, 노드 번호를 출력한다.
  - 해당 노드와 연결되어 있는 노드들 중 작은 순서의 노드 번호를 매개변수로 하여 dfs() 함수를 재귀호출한다.

3. dfs() 함수의 작업이 끝나면 방문 여부 배열(visited)을 다시 초기화해준 뒤 아래와 같은 bfs() 함수의 작업을 수행한다.
  - list에 start를 할당하여 리스트를 정의하고, 해당 노드를 방문 처리한다.
  - list가 빌 때까지 노드를 하나씩 꺼내 화면에 출력하고, 해당 노드와 연결된 노드들 중 작은 순서의 노드 번호를 list에 추가하고 방문 처리한다.

*/
