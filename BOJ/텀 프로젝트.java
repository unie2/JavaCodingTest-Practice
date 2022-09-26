// https://www.acmicpc.net/problem/9466

import java.util.*;
import java.io.*;

public class Main {
	static int[] select;
	static boolean[] visited;
	static List<Integer> success;
	static List<Integer> cycle;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tc=0; tc<t; tc++) {
			int n = Integer.parseInt(br.readLine());
			select = new int[n+1];
			visited = new boolean[n+1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i=1; i<n+1; i++) {
				select[i] = Integer.parseInt(st.nextToken());
			}
			
			success = new ArrayList<>();
			for (int i=1; i<n+1; i++) {
				if (visited[i] == false) {
					cycle = new ArrayList<>();
					dfs(i);
				}
			}
			
			System.out.println(n - success.size());
		}
	}
	
	public static void dfs(int num) {
		visited[num] = true;
		cycle.add(num);
		int target = select[num];
		
		if (visited[target] == true) {
			if (cycle.contains(target)) {
				int start_index = cycle.indexOf(target);
				for (int i=start_index; i<cycle.size(); i++) {
					success.add(cycle.get(i));
				}
			}
			return;
		} else {
			dfs(target);
		}
	}
}

/*
1. 선택된 학생들의 번호(select) 배열과 방문 여부 확인(visited) 배열을 정의한다.
 
2. 1번부터 n번까지 하나씩 확인하는데, 해당 번호가 방문하지 않았다면 cycle 리스트를 정의하고 dfs() 함수를 호출한다.
 
3. 1번부터 n번까지의 번호를 모두 확인한 후 최종적으로 n - success의 길이 값(프로젝트 팀에 속하지 못한 학생들 수)을 출력한다.
 
4. dfs() 함수의 작업은 아래와 같다.
  - 전달받은 num의 방문 여부를 true로 갱신한다.
  - cycle 리스트에 num을 추가하고 num이 선택한 번호를 가져와 target에 할당한다.
  - 만약 target이 이미 방문했다면 cycle리스트에 target이 있는지 확인하고, 있다면 사이클이므로 사이클이 발생하는 구간부터만 팀을 이루어 success 리스트에 추가한다.
  - 만약 target이 아직 방문하지 않았다면 dfs() 함수에 target 값을 매개변수로 하여 재귀호출한다.

*/
