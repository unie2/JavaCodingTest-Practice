// https://www.acmicpc.net/problem/1202


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Info> data = new PriorityQueue<>();
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			data.add(new Info(m, v));
		}
		
		PriorityQueue<Integer> bag = new PriorityQueue<>();
		for (int i=0; i<k; i++) {
			bag.add(Integer.parseInt(br.readLine()));
		}
		
		long result = 0;
		PriorityQueue<Integer> value = new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0; i<k; i++) {
			long pop = bag.poll(); // 최솟값 pop
			while (!data.isEmpty() && data.peek().a <= pop) {
				value.add(data.poll().b);
			}
			
			if (!value.isEmpty())
				result += value.poll();
			else if (data.isEmpty())
				break;
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
1. PriorityQueue()를 통해 무게는 최소로 하되 훔칠 수 있는 보석의 최대 가격을 도출해내 해결한다.
 
2. n개의 보석의 정보를 입력받는데, 입력받은 무게(m)와 가격(v) 값을 data에 최소 힙으로 삽입한다.
 
3. k개의 가방 정보를 입력받는데, 입력받은 수용 무게(able) 값을 bag에 최소 힙으로 삽입한다.
 
4. 최소 힙으로 구성된 bag에서 요소를 하나씩 꺼내고(pop), 아직 보석이 남아있고 가장 먼저 확인하는 보석의 무게가 pop 이하일 경우 아래와 같은 작업을 반복 수행한다.
  - data에서 해당 보석 정보를 꺼내 가격(b) 값을 value에 삽입한다.
  - 이때 훔칠 수 있는 보석의 최대 가격을 구해야 하므로 Collections.reverseOrder()를 통해 최대 힙으로 구성하도록 한다.
 
5. 만약 최대 힙으로 구성된 value에 값이 존재한다면 값을 하나 꺼내 result 값에 누적하고, 그렇지 않고 더 이상 보석이 없다면 break한다.

*/
