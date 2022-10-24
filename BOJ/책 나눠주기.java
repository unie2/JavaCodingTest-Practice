// https://www.acmicpc.net/problem/9576

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			boolean[] flag = new boolean[n+1];
			List<int[]> data = new ArrayList<>();
			for (int j=0; j<m; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int[] temp = {a, b};
				data.add(temp);
			}
			
			Collections.sort(data, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[1] == o2[1])
						return o1[0] - o2[0];
					return o1[1] - o2[1];
				}
			});
			
			int result = 0;
			while (!data.isEmpty()) {
				int[] pop = data.remove(0);
				for (int k=pop[0]; k<=pop[1]; k++) {
					if (flag[k] == false) {
						flag[k] = true;
						result ++;
						break;
					}
				}
			}
			
			System.out.println(result);
		}
	}
}

/*
1. 각 테스트케이스마다 n과 m을 입력받고, 각 책의 보유 여부를 담는 flag 배열을 정의한다. (false면 책이 남아있음을 의미)
 
2. m개의 a, b를 입력받아 data 리스트에 추가하고, b 값을 기준으로 하여 오름차순으로 정렬한다.
 
3. data 리스트가 빌 때까지 아래와 같은 작업을 반복 수행한다.
  - data 리스트에서 우선순위가 가장 높은 요소(정렬했으므로 첫 번째 값)를 꺼내 a, b에 할당한다.
  - a 이상 b 이하의 책 중에 아직 남아 있는 책이 있다면 해당 책의 flag 값을 true로 갱신하고 result를 1 증가시킨 후 break한다.

*/
