import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] data = new int[n][2];
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(data, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		
		for (int i=0; i<n; i++) {
			int x = data[i][0];
			int y = data[i][1];
			System.out.println(x + " " + y);
		}
	}
}

/*
1. n개의 (x, y) 좌표를 입력받는데, StringTokenizer()를 통해 좌표를 입력받아 각각 data[i][0], data[i][1]에 저장한다.
2. Arrays.sort()를 통해 정렬을 수행하며, 이때 (1) x좌표가 증가하는 순 (2) y좌표가 증가하는 순으로 정렬한다.
3. 정렬된 n개의 좌표 값들을 순서대로 출력한다.

*/
