// https://www.acmicpc.net/problem/1927

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
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
1. PriorityQueue()를 통해 문제를 해결할 수 있다.
 
2. n개의 수를 입력받는데, 각 수가 0일 경우 아래 조건 중 해당하는 조건에 맞도록 작업을 수행한다.
  - 만약 pq에 값이 존재하지 않는다면 0을 출력한다.
  - 그렇지 않다면 pq에서 가장 작은 값을 꺼내 출력한다.
 
3. 해당 수가 0이 아닐 경우 add()를 통해 pq에 입력 값을 추가한다.

*/
