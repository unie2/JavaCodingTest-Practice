// https://www.acmicpc.net/problem/1003

import java.util.*;
import java.io.*;

public class Main {
	static List<Integer> zero = new ArrayList<>();
	static List<Integer> one = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		zero.add(1);
		zero.add(0);
		zero.add(1);
		one.add(0);
		one.add(1);
		one.add(1);
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			fibo(n);
		}
	}
	
	public static void fibo(int num) {
		int len = zero.size();
		
		if (num >= len) {
			for (int i=len; i<=num; i++) {
				zero.add(zero.get(i-1) + zero.get(i-2));
				one.add(one.get(i-1) + one.get(i-2));
			}
		}
		
		System.out.println(zero.get(num) + " " + one.get(num));
	}
}

/*
1. 입력받은 num의 zero 사용 개수는 zero[i-1] + zero[i-2]와 같다.
  0일때 : 1개
  1일때 : 0개
  2일때 : 1개
  3일때 : 1개
 
2. 마찬가지로 num의 one 사용 개수는 one[i-1] + one[i-2]와 같다.
  0일때 : 0개
  1일때 : 1개
  2일때 : 1개
  3일때 : 2개
 
3. 따라서 구하고자 하는 대상(num)이 현재의 zero 개수보다 클 경우 length부터 num까지 각 zero의 개수, one의 개수를 구하여 각 리스트에 추가한다.

4. 최종적으로 num을 대상으로 사용한 zero의 개수, one의 개수를 출력한다.

*/
