// https://www.acmicpc.net/problem/13305

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		long[] distance = new long[n-1];
		long[] price = new long[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n-1; i++)
			distance[i] = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++)
			price[i] = Long.parseLong(st.nextToken());
		
		long curr = price[0];
		long result = 0;
		for (int i=0; i<n-1; i++) {
			if (curr > price[i])
				curr = price[i];
			result += curr * distance[i];
		}
		
		System.out.println(result);
		
	}
}

/*
1. 첫번째 주유소는 무조건 가야하므로 curr에 첫번째 주유소의 리터당 가격을 할당한다.
 
2. n - 1까지의 범위로 반복문을 수행하는데, 현재 확인하고 있는 가격과 curr을 비교한 후, curr이 더 크다면 현재 확인하고 있는 가격으로 갱신한다.
 
3. curr에 현재까지의 최소 비용이 담겨져 있으므로, 현재 확인하고 있는 거리 값(distance[i])에 curr을 곱하여 result에 누적한다.
 
4. 반복문이 종료되면 최종적으로 result를 출력한다.

*/
