import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++)
			A.add(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++)
			B.add(Integer.parseInt(st.nextToken()));
		
		int result = 0;
		for (int i=0; i<n; i++) {
			int A_min = Collections.min(A);
			int B_max = Collections.max(B);
			result += A_min * B_max;
			A.remove((Object) A_min);
			B.remove((Object) B_max);
		}
		
		System.out.println(result);
	}
}

/*
1. 각 n개의 값을 A리스트, B리스트에 저장한다.

2. n번 반복 수행하는데, 하나의 수행 작업은 아래와 같다.
  - A 리스트에서 최솟값을 꺼내 A_min에 할당한다.
  - B 리스트에서 최댓값을 꺼내 B_max에 할당한다.
  - result에 (A_min * B_max) 를 누적한다.
  - A 리스트에서 A_min 값을 삭제하고, B 리스트에서 B_min 값을 삭제한다.
  - 이때 remove() 매개변수 작성 시 (Object) 를 작성해주지 않는다면 A_min 혹은 B_max를 프로그램에서 index로 판별하기 때문에 (Object)를 작성해주어야 한다.

*/
