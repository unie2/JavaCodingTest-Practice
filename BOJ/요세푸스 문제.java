import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, k;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int index = 0;
		int[] result = new int[n];
		List<Integer> data = new ArrayList<>();
		for (int i=0; i<n; i++) {
			data.add(i+1);
		}
		for (int i=0; i<n; i++) {
			index += (k - 1);
			if (index >= data.size())
				index %= data.size();
			
			result[i] = data.remove(index);
		}
		
		StringJoiner sj = new StringJoiner(", ");
		for (int i=0; i<result.length; i++) {
			sj.add(Integer.toString(result[i]));
		}
		bw.write('<');
		bw.write(sj.toString() + '>');
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/*
1. 1부터 n까지의 수를 data 리스트에 추가한다.

2. n번의 반복 작업을 수행하는데, 작업은 아래와 같다.
  - 현재의 index 값에 (k-1) 값을 누적한다.
  - 만약 index값이 data 리스트의 크기 이상이라면 나머지 값을 구하여 index를 갱신한다.
  - result[i]에 data 리스트의 index 위치에 있는 값을 할당한다. (data 리스트에서는 해당 요소를 삭제)

3. 문제에서 요구하는 형식으로 출력하기 위해 StringJoiner를 통해 데이터 간에 ", "를 삽입하여 구분한 후 출력한다.

*/
