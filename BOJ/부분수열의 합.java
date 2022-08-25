import java.util.*;

public class Main {
	static int result;
	static int s;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = sc.nextInt();
		result = 0;
		
		int[] data = new int[n];
		for (int i=0; i<n; i++)
			data[i] = sc.nextInt();
		
		boolean[] visited = new boolean[n];
		for (int i=1; i<=n; i++) {
			combination(data, visited, 0, i);
		}
		
		System.out.println(result);
	}
	
	static void combination(int[] data, boolean[] visited, int start, int r) {
		if (r == 0) {
			check(data, visited);
			return;
		} else {
			for (int i=start; i<data.length; i++) {
				visited[i] = true;
				combination(data, visited, i+1, r-1);
				visited[i] = false;
			}
		}
	}
	
	static void check(int[] data, boolean[] visited) {
		int sum = 0;
		for (int i=0; i<data.length; i++) {
			if (visited[i] == true) {
				sum += data[i];
			}
		}
		
		if (sum == s)
			result ++;
	}
}

/*
1. 백트래킹을 활용한 조합을 구현하여 문제를 해결할 수 있다.

2. 조합을 위한 combination() 함수의 작업은 아래와 같다.
  - 만약 전달받은 r 값이 0일 경우 i개의 값들을 모두 도출하였으므로 check() 함수를 통해 데이터들의 합을 확인한다.
  - 반복문의 시작값을 start로 지정하고, visited[i]를 true하여 방문처리를 해준 뒤 combination() 함수를 재귀호출한다.
  - 이때 현재 확인하고 있는 값의 다음 값부터 확인할 수 있도록 start 매개변수 위치에 1을 증가한 값(i+1)을 설정하고, 하나의 값을 뽑아냈으므로 r 매개변수 위치에 r-1을 설정하여 호출한다.
  - combination() 함수를 재귀호출한 후 다른 방법 또한 도출해야하므로 visited[i] 값을 false로 다시 갱신한다.

3. check() 함수에서는 도출된 값들의 합과 s 를 비교하여 같을 경우 result 값을 1 증가시킨다.

*/
