import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] flag = new boolean[1000001];
		Arrays.fill(flag, true);
		for (int i=3; i<1000001; i++) {
			if (flag[i]) {
				for (int j=i+i; j<1000001; j=j+i) {
					flag[j] = false;
				}
			}
		}
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			
			int count = 0;
			for (int i=3; i<1000001; i++) {
				if (flag[i] && flag[n-i]) {
					System.out.println(n + " = " + i + " + " + (n-i));
					count = 1;
					break;
				}
			}
			
			if (count == 0)
				System.out.println("Goldbach's conjecture is wrong.");
		}
	}
}

/*
1. 에라토스테네스의 체 알고리즘을 통해 1000000까지 각 소수 여부를 구한 뒤 입력받은 n이 0이 아닐 경우에 while문을 계속해서 수행한다.

2. while문 내부에서는 다시 for문을 통해 해당 값이 참(소수)이고 n-i 번째 값 또한 참(소수)이라면 문제에서
   요구하는 출력 형식에 맞게 값들을 출력한다.
 
3. 또한, count 값을 1로 갱신한 뒤 count 값을 확인하여 그 값이 0이라면 두 홀수 소수의 합으로 n을 나타낼 수 없기 때문에 문제에서 주어진 문자열을 출력한다.

*/
