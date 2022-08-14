import java.util.*;
import java.io.*;

public class Main {
	static List<Integer> data;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		data = new ArrayList<Integer>();
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String state = st.nextToken();
			
			if (state.equals("push")) { // push X
				int num = Integer.parseInt(st.nextToken());
				data.add(num);
			} else if (state.equals("pop")) { // pop
				if (data.size() == 0)
					System.out.println(-1);
				else {
					int result = data.remove(data.size() - 1);
					System.out.println(result);
				}
			} else if (state.equals("size")) { // size
				System.out.println(data.size());
			} else if (state.equals("empty")) { // empty
				if (data.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			} else if (state.equals("top")) { // top
				if (data.size() == 0)
					System.out.println(-1);
				else {
					int result = data.get(data.size()-1);
					System.out.println(result);
				}
			}
		}
	}
}

/*
1. 입력받은 state 값이 "push"일 경우 아래와 같은 작업을 수행한다.
  - 정수를 하나 입력받아 num에 저장하고 그 값을 data 리스트에 추가한다.

2. 입력받은 state 값이 "pop"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 즉, 값이 없을 경우 -1을 출력한다.
  - 값이 존재할 경우 가장 마지막에 위치하고 있는 값을 꺼내 출력한다.

3. 입력받은 state 값이 "size"일 경우 data 리스트의 길이를 출력한다.

4. 입력받은 state 값이 "empty"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 즉, 값이 없을 경우 1을 출력한다.
  - data 리스트의 size()가 0이 아닐 경우 즉, 값이 존재할 경우 0을 출력한다.

5. 입력받은 state 값이 "top"일 경우 아래와 같은 작업을 수행한다.
  - 만약 data 리스트의 size()가 0일 경우 -1을 출력한다.
  - 그렂히 않다면 가장 마지막에 있는 요소를 가져와 출력한다.

*/
