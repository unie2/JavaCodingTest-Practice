// https://www.acmicpc.net/problem/1826

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Info> temp = new PriorityQueue<>();
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			temp.add(new Info(a, b));
		}
		
		st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int result = 0;
		while (p < l) {
			while (!temp.isEmpty() && temp.peek().a <= p) {
				pq.add(temp.poll().b);
			}
			
			if (pq.isEmpty()) {
				result = -1;
				break;
			}
			
			p += pq.poll();
			result ++;
		}
		
		System.out.println(result);
	}
	
	public static class Info implements Comparable<Info> {
		int a;
		int b;
		
		public Info(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public int compareTo(Info o) {
			return this.a - o.a;
		}
	}
}

/*
1. PriorityQueue()를 통해 n개의 주유소 정보를 temp에 할당한다.
 
2. 현재의 연료(p)로 마을까지 갈 수 있어야 하므로, p가 성경이의 위치에서 마을까지의 거리(l)보다 작은 값일 동안에 아래와 같은 작업을 반복한다.
  - temp에 요소가 존재하고 가장 먼저 도출되는 값의 마을까지의 거리가 현재의 연료로 갈 수 있다면 pq에 b 값을 삽입한다. 
    즉, 채울 수 있는 연료의 양의 경우 최대 값 순으로 구성될 수 있도록 한다.
    
  - 만약 pq에 요소가 없다면 마을에 도착하지 못하는 경우이므로 result에 -1을 할당하고 break한다.
  
  - pq에 요소가 존재할 경우 우선순위가 높은 값을 꺼내고 p에 누적함으로써 연료를 채운 후 result 값을 1 증가시킨다.
*/
