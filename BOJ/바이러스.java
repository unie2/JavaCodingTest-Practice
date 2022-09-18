// https://www.acmicpc.net/problem/2606

import java.util.*;

public class Main {
	static boolean[] flag;
	static Map<Integer, List> map = new HashMap<>();
	static int result = 0;
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		flag = new boolean[total + 1];
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			List<Integer> list = map.getOrDefault(a, null);
			if (list == null) { // null이면 새로운 ArrayList로 정의
				list = new ArrayList<>();
			} 
			list.add(b);
			map.put(a, list);
			
			List<Integer> list_b = map.getOrDefault(b, null);
			if (list_b == null) { // null이면 새로운 ArrayList로 정의
				list_b = new ArrayList<>();
			} 
			list_b.add(a);
			map.put(b, list_b);
		}
		
		bfs(1);
	}
	
	public static void bfs(int num) {
		flag[num] = true;
		Queue<Integer> list = new LinkedList<>();
		list.add(num);
		
		while(list.isEmpty() == false) {
			int value = list.remove();
			for (int i=0; i<map.get(value).size(); i++) {
				if (flag[(int) map.get(value).get(i)] == false) {
					flag[(int) map.get(value).get(i)] = true;
					result ++;
					list.add((int) map.get(value).get(i));
				}
			}
		}
		
		System.out.println(result);
	}
}


/*
1. 컴퓨터의 개수(total)를 입력받아 각 컴퓨터의 방문 여부를 담은 flag 배열을 정의하고, map을 정의한다.

2. 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍을 n번 입력받아 각각 map에 연결한다.

3. bfs() 함수를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 구하여 출력한다. bfs() 함수의 작업은 아래와 같다.
  - 가장 처음 전달받은 1번 컴퓨터의 flag 값을 true로 갱신하고 Queue를 정의하여 1번 컴퓨터를 list에 추가한다.
  - list가 빌 때까지 아래와 같은 작업을 수행한다.
    - list에 존재하는 값을 하나 꺼내 value에 할당하고, value에 연결되어 있는 컴퓨터를 한대씩 확인한다. (map.get(value).get(i))
    - 확인하고 있는 컴퓨터가 아직 방문되지 않았으면 방문처리하고 result를 1증가시킨 후 list에 해당 컴퓨터 번호를 추가한다.
  - list에 존재하는 컴퓨터들을 모두 확인한 후 최종적으로 result 값을 출력한다.

*/
