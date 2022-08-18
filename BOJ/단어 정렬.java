import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_m {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] data = new String[n];
		
		for (int i=0; i<n; i++)
			data[i] = br.readLine();
		
		Arrays.sort(data, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(data[0]);
		for (int i=1; i<n; i++) {
			if (!data[i].equals(data[i-1])) {
				System.out.println(data[i]);
			}
		}
	}
}

/*
1. n개의 단어를 data 배열에 저장한 후 문제에서 요구한 조건에 따라 정렬을 수행한다.
2. 이때 Arrays.sort()를 사용하며 compare()를 재정의해줌으로써 (1) 길이가 짧은 것부터 (2) 길이가 같으면 사전 순으로 정렬한다.
3. 중복된 문자는 한 번만 출력하면 되므로, 이전 값과 비교하여 단어가 다를 경우에만 data[i] 값을 출력한다.

*/
