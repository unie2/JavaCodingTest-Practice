// https://www.acmicpc.net/problem/2805

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] trees = new long[(int)n];
		long max = 0;
		for (int i=0; i<n; i++) {
			long value = Integer.parseInt(st.nextToken());
			max = Math.max(max, value);
			trees[i] = value;
		}
		
		long start = 1;
		long end = max;
		
		while (start <= end) {
			long mid = (start + end) / 2;
			
			long sum_value = 0;
			for (long tree : trees) {
				if (tree > mid) {
					sum_value += tree - mid;
				}
			}
			
			if (sum_value >= m)
				start = mid + 1;
			else
				end = mid - 1;
		}
		
		System.out.println(end);
	}
}

/*
1. 이분 탐색을 통해 절단기에 설정할 수 있는 높이를 구하면 문제를 해결할 수 있다. 또한, 문제에서 제시한 값들의 범위는 int 형으로는 처리할 수 없으므로 long형으로 데이터를 처리한다.
 
2. 초기 start, end 값은 각 1과 trees 배열 내 요소들 중 최댓값으로 설정한다.
 
3. start 값이 end 보다 커질 때까지 while문을 통해 아래와 같은 작업을 반복 수행한다.
  - start 값과 end 값을 기준으로 중간 값을 구하여 mid에 할당한다.
  - trees에 담겨있는 나무를 하나씩 확인하는데, 나무(tree)가 mid보다 클 경우 절단 후 가져갈 수 있는 길이(tree - mid)를 sum_value에 더한다.
  - 만약 sum_value가 m 이상일 경우 자신이 가져가야할 나무 길이보다 현재 가져가게 되는 길이가 더 크므로 절단 높이를 더 높여야 한다. 따라서, start를 mid+1 값으로 갱신한다.
  - 만약 sum_value가 m보다 작을 경우 자신이 더 가져가야 하므로 절단 높이를 더 낮춰야 한다. 따라서 end를 mid-1 값으로 갱신한다.

*/
