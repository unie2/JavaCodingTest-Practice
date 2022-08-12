import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n];
		for (int i=0; i<n; i++)
			data[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(data);
		
		for (int i=0; i<n; i++)
			bw.write(data[i] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}

// 1. n개의 값을 data 배열에 저장한 후 오름차순으로 정렬한다.
// 2. 정렬된 data 배열의 값을 하나씩 bw에 추가하고, 반복문이 종료되면 bw에 저장된 데이터를 출력한다.
