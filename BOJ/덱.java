import java.io.*;
import java.util.*;

public class Solution_m {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> data = new ArrayDeque<>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String state = st.nextToken();
			
			if (state.equals("push_front")) {
				int num = Integer.parseInt(st.nextToken());
				data.addFirst(num);
			} else if (state.equals("push_back")) {
				int num = Integer.parseInt(st.nextToken());
				data.add(num);
			} else if (state.equals("pop_front")) {
				if (data.size() == 0)
					bw.append(-1 + "\n");
				else {
					int num = data.poll();
					bw.append(num + "\n");
				}
			} else if (state.equals("pop_back")) {
				if (data.size() == 0)
					bw.append(-1 + "\n");
				else {
					int num = data.pollLast();
					bw.append(num + "\n");
				}
			} else if (state.equals("size"))
				bw.append(data.size() + "\n");
			else if (state.equals("empty")) {
				if (data.size() == 0)
					bw.append(1 + "\n");
				else
					bw.append(0 + "\n");
			} else if (state.equals("front")) {
				if (data.size() == 0)
					bw.append(-1 + "\n");
				else {
					int num = data.getFirst();
					bw.append(num + "\n");
				}
			} else if (state.equals("back")) {
				if (data.size() == 0)
					bw.append(-1 + "\n");
				else {
					int num = data.getLast();
					bw.append(num + "\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/*
1. 입력받은 state 값이 "push_front" 혹은 "push_back"일 경우 아래와 같은 작업을 수행한다.
  - 정수 num을 입력받고, "push_front"일 경우 data 덱의 앞에, "push_back"일 경우 data 덱의 뒤에 삽입한다.

2. 입력받은 state 값이 "pop_front" 혹은 "pop_back"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 덱의 size()가 0일 경우 즉, 값이 없을 경우 -1을 출력한다.
  - 값이 존재하고 state 값이 "pop_front"일 경우 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.
  - 값이 존재하고 state 값이 "pop_back"일 경우 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다.

3. 입력받은 state 값이 "size"일 경우 data 덱의 길이를 출력한다.

4. 입력받은 state 값이 "empty"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 덱의 size()가 0일 경우 즉, 값이 없을 경우 1을 출력한다.
  - data 덱의 size()가 0이 아닐 경우 즉, 값이 존재할 경우 0을 출력한다.

5. 입력받은 state 값이 "front" 혹은 "back"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 덱의 size()가 0일 경우 -1을 출력한다.
  - 값이 존재하고 state 값이 "front"일 경우 덱의 가장 앞에 있는 정수를 출력한다.
  - 값이 존재하고 state 값이 "back"일 경우 덱의 가장 뒤에 있는 정수를 출력한다.

*/
