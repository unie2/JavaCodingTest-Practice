import java.util.*;
import java.io.*;

public class Solution_m {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<Integer> data = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String state = st.nextToken();
			if (state.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				data.add(num);
			} else if (state.equals("pop")) {
				if (data.size() == 0) {
					bw.append(-1 + "\n");
				} else {
					int pop = data.remove(0);
					bw.append(pop + "\n");
				}
			} else if (state.equals("size")) {
				bw.append(data.size() + "\n");
			} else if (state.equals("empty")) {
				if (data.size() == 0)
					bw.append(1 + "\n");
				else
					bw.append(0 + "\n");
			} else if (state.equals("front")) {
				if (data.size() == 0)
					bw.append(-1 + "\n");
				else
					bw.append(data.get(0) + "\n");
			} else if (state.equals("back")) {
				if (data.size() == 0)
					bw.append(-1 + "\n");
				else
					bw.append(data.get(data.size()-1) + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/*
1. 입력받은 state 값이 "push"일 경우 아래와 같은 작업을 수행한다.
  - 정수를 하나 입력받아 num에 저장하고 그 값을 data 리스트에 추가한다.

2. 입력받은 state 값이 "pop"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 즉, 값이 없을 경우 -1을 출력한다.
  - 값이 존재할 경우 가장 처음에 위치하고 있는 값을 꺼내 출력한다.

3. 입력받은 state 값이 "size"일 경우 data 리스트의 길이를 출력한다.

4. 입력받은 state 값이 "empty"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 즉, 값이 없을 경우 1을 출력한다.
  - data 리스트의 size()가 0이 아닐 경우 즉, 값이 존재할 경우 0을 출력한다.

5. 입력받은 state 값이 "front"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 -1을 출력한다.
  - 그렇지 않다면 가장 처음에 있는 요소를 출력한다.

6. 입력받은 state 값이 "back"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 -1을 출력한다.
  - 그렇지 않다면 가장 마지막에 있는 요소를 출력한다.

*/
