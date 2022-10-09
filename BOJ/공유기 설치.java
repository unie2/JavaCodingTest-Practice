// https://www.acmicpc.net/problem/2110

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] data = new int[n];
		
		int start = 1;
		int end = 0;
		for (int i=0; i<n; i++) {
			data[i] = sc.nextInt();
			end = Math.max(end, data[i]);
		}
		
		Arrays.sort(data);
		
		while (start <= end) {
			int mid = (start + end) / 2;
			int curr = data[0];
			int count = 1;
			
			for (int d : data) {
				if (d >= curr + mid) {
					count ++;
					curr = d;
				} 
			}
			
			if (count >= c)
				start = mid + 1;
			else
				end = mid - 1;
		}
		
		System.out.println(end);
	}
}

/*
1. 이분 탐색을 통해 가장 인접한 두 공유기 사이의 최대 거리를 구한다.

2. n개의 집의 좌표를 입력받아 오름차순으로 정렬하여 data 배열에 저장한다.

3. start와 end의 값을 각각 1과 data 배열 요소 중 최대값으로 초기화한 후 start가 end보다 커질 때까지 아래와 같은 작업을 반복한다.
  - start와 end의 중간값을 구해 mid에 할당하고, curr에 data 배열의 가장 첫번째 요소를 할당한 후 설치한 공유기의 개수를 의미하는 count를 1로 초기화한다.
  - data 배열의 요소를 하나씩 확인하는데, 해당 좌표가 (curr + mid) 즉, 현재 지점에서 mid만큼 떨어진 거리 이상일 경우 count를 1 증가시킴으로써 설치 작업을 하고 curr을 현재의 요소 좌표로 갱신한다.
 
  - 만약 설치한 공유기의 개수(count)가 c 이상일 경우 더 넓게 설치할 수 있으므로 start를 mid+1로 갱신한다.
  - 반대로 설치한 공유기의 개수가 c보다 작다면 더 좁게 설치해야 하므로 end를 mid-1로 갱신한다.

*/
