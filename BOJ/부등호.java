// https://www.acmicpc.net/problem/2529

import java.io.*;
import java.util.*;

public class Main {
	static int k;
	static String[] data;
	static List<String> result = new ArrayList<>();
	static boolean[] flag = new boolean[10];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		data = new String[k];
		for (int i=0; i<k; i++)
			data[i] = st.nextToken();
		
		func(0, "");
		
		Collections.sort(result);
		System.out.println(result.get(result.size()-1));
		System.out.println(result.get(0));
	}
	
	public static void func(int index, String num) {
		if (index == k + 1) {
			result.add(num);
			return;
		}
		
		for (int i=0; i<10; i++) {
			if (flag[i] == true)
				continue;
			
			if (index == 0 || check(Character.getNumericValue(num.charAt(index-1)), i, data[index-1]) == true) {
				flag[i] = true;
				func(index + 1, num.concat(String.valueOf(i)));
				flag[i] = false;
			}
		}
	}
	
	public static boolean check(int prev, int next, String oper) {
		if (oper.equals("<")) {
			if (prev > next)
				return false;
		}
		if (oper.equals(">")) {
			if (prev < next)
				return false;
		}
		
		return true;
	}
}

/*
1. 재귀 호출을 통해 수를 하나씩 이어붙여 올바른 부등호 식을 result 리스트에 추가하는 방식이다.
 
2. 0부터 9까지의 각 수의 사용 여부를 담은 flag 배열을 정의하고, func() 함수를 호출한 후 정의된 result 리스트를 오름차순으로 정렬하여 마지막 요소(최댓값)과 첫 번째 요소(최솟값)을 출력한다.
 
3. func() 함수의 작업은 아래와 같다.
  - 만약 index가 k + 1일 경우 수를 뽑아내야 할 갯수만큼 다 뽑았으므로 result 리스트에 num 을 추가하고 return한다.
 
  - 0부터 9까지의 수를 대상으로 사용 여부를 확인하여, 해당 수를 이미 사용했으면 continue한다.
  - 아직 사용하지 않았고, index가 0이거나 (현재까지 정의된 num의 마지막 값, 현재의 값, 부등호)를 매개변수로 하여 check() 함수를 호출하여 반환받은 값이 true라면 해당 수의 사용 여부를 true로 갱신하고 func() 함수를 재귀 호출한다.
  - func() 함수를 재귀 호출한 후에는 다른 값들도 확인해야 하므로 해당 수의 사용 여부를 다시 false로 갱신한다.

*/
