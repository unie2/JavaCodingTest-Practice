// https://www.acmicpc.net/problem/11286

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// 절대값 비교
				if (Math.abs(o1) > Math.abs(o2)) {
					return Math.abs(o1) - Math.abs(o2);
				} else if (Math.abs(o1) == Math.abs(o2)) {
					// 같다면 입력 값을 기준으로 오름차순 정렬
					return o1 - o2;
				} else {
					return -1;
				}
			}
		});
		
		for (int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pq.isEmpty())
					bw.write(0 + "\n");
				else
					bw.write(pq.remove() + "\n");
			} else {
				pq.add(x);
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}


/*
1. PriorityQueue()를 통해 문제를 해결할 수 있다. 이때 정렬 우선순위를 아래와 같이 재정의한다.
  - 가장 먼저 두 수의 절댓값을 비교하여 오름차순으로 정렬한다.
  - 두 수의 절댓값이 같을 경우 기존의 입력 값을 기준으로 비교하여 오름차순으로 정렬한다.
 
2. n개의 수를 입력받는데, 각 수가 0일 경우 아래 조건 중 해당하는 조건에 맞도록 작업을 수행한다.
  - 만약 pq에 값이 존재하지 않는다면 0을 출력한다.
  - 그렇지 않다면 pq에서 가장 작은 값을 꺼내 출력한다. 이때 PriorityQueue()에 정렬 우선순위를 재정의했으므로
     (절댓값 비교 작은 값 -> 같다면 입력값 비교 작은 값) 순으로 값을 도출한다.
 
3. 해당 수가 0이 아닐 경우 add()를 통해 pq에 입력 값을 추가한다.

*/
