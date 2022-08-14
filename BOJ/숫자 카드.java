import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] data;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		data = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++)
			data[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(data);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if (binarySearch(0, n-1, value)) {
				bw.append(1 + " ");
			} else {
				bw.append(0 + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static boolean binarySearch(int start, int end, int value) {
		if (start > end)
			return false;
		int mid = (start + end) / 2;
		if (data[mid] == value)
			return true;
		
		if (value < data[mid])
			return binarySearch(start, mid-1, value);
		else
			return binarySearch(mid+1, end, value);
	}
}

/*
1. n개의 값을 입력받아 data 배열에 저장하고 이분 탐색을 수행하기 위해 오름차순으로 정렬한다.

2. m개의 값을 입력받아 하나의 값에 대하여 binarySearch() 함수를 수행하여 그 값이 data 배열에 존재한다면 bw에 1을 추가하고, 아니라면 0을 추가한다.

3. 이분 탐색 binarySearch() 함수의 작업은 아래와 같다.
  - 만약 start(시작점)이 end(끝 점) 보다 클 경우 더 이상 확인할 데이터가 없으므로 false를 반환한다.
  - 시작점과 끝 점을 기준으로 중간 값 인덱스를 구하여 mid에 할당한다.
  - 만약 중간 값이 value와 일치한다면 true를 반환한다.
  - 그렇지 않고, value가 중간 값보다 작을 경우 왼쪽 범위를 확인해야 하므로 끝 점을 mid-1 값으로 하여 binarySearch() 함수를 재귀호출한다.
  - 그렇지 않고, value가 중간 값보다 클 경우 오른쪽 범위를 확인해야 하므로 시작 점을 mid+1 값으로 하여 binarySearch() 함수를 재귀호출한다.

4. 최종적으로 bw에 담겨있는 정보들을 출력한다.

*/
