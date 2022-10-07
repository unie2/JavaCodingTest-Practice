// https://www.acmicpc.net/problem/2869

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long v = Long.parseLong(st.nextToken());
		
		long value = (v - b) / (a - b);
		if ((v-b)%(a-b) != 0)
			System.out.println(value + 1);
		else
			System.out.println(value);
	}
}

/*
1. 달팽이가 올라갔다 다시 미끄러지는 과정에서 실질적으로 올라갈 수 있는 거리(ex. 3미터 올라가고, 1미터 떨어진다면 실질적으로 올라갈 수 있는 거리는 2미터)를 구해 value에 할당한다.
 
2. 만약 value가 나머지가 없는 값이라면 단순히 value를 출력하고, 그렇지 않다면 한 번 더 올라가야 하므로 value에 1을 더한 값을 출력한다.

*/
