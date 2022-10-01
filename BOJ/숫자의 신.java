// https://www.acmicpc.net/problem/1422


import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		String[] str = new String[k];
		int max_value = 0;
		
		for (int i=0; i<k; i++) {
			str[i] = br.readLine();
			max_value = Math.max(max_value, Integer.parseInt(str[i]));
		}
		
		Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		
		StringBuilder result = new StringBuilder();
		boolean flag = true;
		for (String value : str) {
			result.append(value);
			if (Integer.parseInt(value) == max_value && flag) {
				for (int i=0; i<n-k; i++) {
					result.append(value);
				}
				flag = false;
			}
		}
		
		System.out.println(result);
	}
}

/*
1. k개의 수를 입력받아 문자열 형태로 str 배열에 할당하고, 그 중 가장 큰 값을 max_value에 할당한다.
 
2. 두 문자열을 이어붙였을 때 더 큰 값을 구성하여 정렬을 수행한다.
 
3. 정렬된 str 배열의 문자열을 차례대로 확인하여 result에 추가하고, 만약 그 값이 최대값이고 flag가 true라면 n-k개 만큼 result에 더 추가한 뒤 flag를 false로 갱신한다.
 
4. 최종적으로 구성된 result 값을 출력한다.

*/
