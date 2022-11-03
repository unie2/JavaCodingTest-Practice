// https://www.acmicpc.net/problem/1655

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> leftheap = new PriorityQueue<>();
		PriorityQueue<Integer> rightheap = new PriorityQueue<>();
		
		for (int i=0; i<n; i++) {
			int value = Integer.parseInt(br.readLine());
			if (leftheap.size() == rightheap.size())
				leftheap.add(-value);
			else
				rightheap.add(value);
			
			if (!rightheap.isEmpty() && -leftheap.peek() > rightheap.peek()) {
				int min_value = rightheap.poll();
				int max_value = -leftheap.poll();
				leftheap.add(-min_value);
				rightheap.add(max_value);
			}
			
			bw.write(-leftheap.peek() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}


/*
1. 중간 값을 기준으로 하여 더 작은 값들은 leftheap에, 더 큰 값들은 rightheap에 구성될 수 있도록 한다.
  - 이때  PriorityQueue의 default 구성은 오름차순 형태이므로 leftheap에 들어가는 값의 경우 (-)를 붙여 최대힙 형태로 구성될 수 있도록 한다.
 
2. 값을 하나씩 입력받고, 만약 leftheap의 길이와 rightheap의 길이가 같을 경우 해당 값을 leftheap에 삽입한다.
 
3. 반면 두 길이가 다를 경우 길이를 맞춰주기 위해 해당 값을 rightheap에 삽입한다.
 
4. 만약 rightheap에 값이 있고 leftheap의 루트가 rightheap의 루트보다 크면 루트 값을 서로 바꿔준다.
 
5. 구성된 heap에서 중간 값(-leftheap.peek())을 도출해내 bw에 추가하고, n개의 값에 대한 작업을 모두 마치면 최종적으로 bw를 출력한다.

*/
