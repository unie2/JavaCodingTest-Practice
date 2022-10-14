// https://www.acmicpc.net/problem/1715

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i=0; i<n; i++)
			pq.add(sc.nextInt());
		
		if (n == 1)
			System.out.println(0);
		else {
			int total = 0;
			while (pq.size() > 1) {
				int pop_1 = pq.remove();
				int pop_2 = pq.remove();
				total += pop_1 + pop_2;
				pq.add(pop_1 + pop_2);
			}
			
			System.out.println(total);
		}
	}
}

/*
1. PriorityQueue()를 통해 pq에 있는 가장 작은 두개의 수를 꺼내 더하고, 이를 다시 pq에 추가하는 방식으로 문제를 해결할 수 있다.
 
2. n개의 수를 입력받아 pq에 추가한다.
 
3. 만약 n이 1일 경우 비교할 필요가 없으므로 0을 출력하고, pq의 길이가 1보다 클 경우 아래의 작업을 반복 수행한다.
  - pq에서 가장 작은 두개의 값을 꺼내 각 pop_1, pop_2에 할당한다.
  - 두 수를 더해 total에 누적함으로써 비교 횟수를 누적한다.
  - 두 수를 더한 값을 다시 pq에 추가한다.

*/
