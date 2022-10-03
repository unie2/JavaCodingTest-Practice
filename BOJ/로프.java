// https://www.acmicpc.net/problem/2217

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = sc.nextInt();	
		}
		
		Arrays.sort(data);
		
		int max_value = 0;
		for (int i=0; i<n; i++) {
			max_value = Math.max(max_value, data[i] * (n - i));
		}
		
		System.out.println(max_value);
	}
}


/*
1. n개의 중량을 입력받아 data 배열에 할당하고, 오름차순으로 정렬한다.

2. 정렬된 중량값을 차례대로 확인하여, 만약 (현재의 중량 * 이후에 남은 중량 개수) 값이 max_value 보다 크다면 그 max_value를 갱신한다.
*/
