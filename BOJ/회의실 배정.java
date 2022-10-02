// https://www.acmicpc.net/problem/1931

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		
		for (int i=0; i<n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			time[i][0] = start;
			time[i][1] = end;
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] < o2[1])
					return -1;
				else if (o1[1]> o2[1])
					return 1;
				else {
					if (o1[0] < o2[0])
						return -1;
					else
						return 1;
				}
			}
		});
		
		int result = 1;
		int end_time = time[0][1];
		for (int i=1; i<n; i++) {
			if (time[i][0] >= end_time) {
				end_time = time[i][1];
				result ++;
			}
		}
		
		System.out.println(result);
	}
}

/*
1. 2차원 time 배열을 정의하여 n개의 회의실의 시작시간과 끝나는 시간을 각각 time[i][0], time[i][1]에 할당한다.
 
2. 가장 많은 회의실을 이용할 수 있는 최대 횟수를 구하기 위해 회의가 빨리 끝나는 순(같다면 시작 시간이 이른 순)으로 정렬한다.
 
3. 이후 정렬된 time 배열에서 가장 첫 회의의 끝나는 시간을 end_time에 할당한 후 1번째 회의부터 확인한다.
 
4. time[i] 회의의 시작 시간이 end_time 값 이상이라면 회의가 겹치지 않으므로 end_time을 갱신하고 result 값을 1 증가시킨다.

*/
