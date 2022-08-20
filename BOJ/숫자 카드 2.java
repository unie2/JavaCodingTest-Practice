import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Map<Integer, Integer> map = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int value = Integer.parseInt(st.nextToken());
			map.put(value, map.getOrDefault(value, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			int key = Integer.parseInt(st.nextToken());
			Integer value = map.get(key);
			if (value == null)
				bw.write(0 + " ");
			else
				bw.write(value + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/*
1. 해시 맵을 통해 숫자의 개수를 구하여 문제를 해결할 수 있다.
2. n개의 수를 입력받는데, 하나의 수를 입력받을 때마다 해당 수를 해시 맵의 key로 하여 개수(value)를 꺼낸다.
3. 이때 해당 key가 없을 경우 default로 0으로 설정한다.
4. 꺼낸 value 값에 1을 더하여 다시 해시 맵에 저장한다.
5. m개의 수를 입력받는데, 하나의 수를 입력받을 때마다 해당 수를 해시 맵의 key로 하여 개수(value)를 꺼낸다.
6. 만약 그 값이 null일 경우 해당 수가 적혀있는 카드를 갖고 있지 않으므로 bw에 0을 추가하고, 그렇지 않을 경우 그 값을 추가한다.

*/
