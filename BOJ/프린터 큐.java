import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=t; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			List<Integer> priority = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++)
				priority.add(Integer.parseInt(st.nextToken()));
			
			List<Integer> check = new ArrayList<>();
			for (int i=0; i<n; i++)
				check.add(0);
			check.set(m, 1);
			
			int count = 0;
			while (true) {
				if (priority.get(0) == max(priority)) {
					count ++;
					if (check.get(0) == 1) {
						bw.write(count + "\n");
						break;
					} else {
						priority.remove(0);
						check.remove(0);
					}
				} else {
					priority.add(priority.remove(0));
					check.add(check.remove(0));
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int max(List<Integer> list) {
		int max = 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		
		return max;
	}
}

/*
1. 각 테스트 케이스마다 입력받은 n개의 0 값을 저장한 check 리스트를 생성하고, check의 m번째 값을 1로 갱신한다.

2. 아래와 같은 작업을 반복 수행한다.
  - 만약 priority의 가장 첫 번째 요소가 최댓값과 같다면 count를 1증가시킨다.
  - 만약 check의 가장 첫 번째 요소가 1일 경우 찾을 값이므로 count를 출력한 후 break 한다.
  - check의 0번째 요소가 1이 아닐 경우 priority의 가장 첫 번째 요소와 check의 가장 첫 번째 요소를 빼낸다.

  - 만약 priority의 0번째 요소가 최댓값이 아닐 경우 priority의 가장 첫 번째 요소와 check의 가장 첫 번째 요소를 각각 빼내어 뒤로 넘겨 준다.

*/
