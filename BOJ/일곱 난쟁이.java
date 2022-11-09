// https://www.acmicpc.net/problem/2309

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[9];
		
		int sum_value = 0;
		for (int i=0; i<9; i++) {
			data[i] = sc.nextInt();
			sum_value += data[i];
		}
		
		Arrays.sort(data);
		int a = 0;
		int b = 0;
		
		boolean flag = true;
		for (int i=0; i<8; i++) {
			for (int j=i+1; j<9; j++) {
				if (sum_value - data[i] - data[j] == 100) {
					a = data[i];
					b = data[j];
					flag = false;
					break;
				}
			}
			
			if (flag == false)
				break;
		}
		
		for (int da : data) {
			if (da == a || da == b)
				continue;
			System.out.println(da);
		}
	}
}

/*
1. 입력된 9개의 값들을 data 배열에 정의하고, 각 수를 sum_value에 누적하여 9개 수의 합을 구한다.
 
2. data 배열을 오름차순으로 정렬하고, 제외시킬 두 명의 난쟁이 키를 담을 a와 b를 초기화한다.
 
3. data 배열에서 값을 차례대로 하나씩 타겟으로 잡고, 해당 인덱스 다음 수부터 확인하여 만약 sum_value에서 타겟 data[i]와 data[j]을 뺀 값이 100일 경우 
   a에 data[i]를, b에 data[j]를 할당한 후 이중 for문을 벗어난다.
 
4. data 배열의 값을 하나씩 출력하는데, 만약 그 값이 a이거나 b일 경우 제외시켜야 하므로 continue한다.

*/
