import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i=0; i<n; i++)
			data[i] = sc.nextInt();
		
		Arrays.sort(data);
		
		for (int i=0; i<n; i++)
			sb.append(data[i] + "\n");
		
		System.out.println(sb);
	}
}

// 1. n개의 값을 data 배열에 저장하고 오름차순으로 정렬한다.
// 2. StringBuilder() 를 통해 생성된 sb에 data[i]를 추가하고, 반복문이 종료되면 sb를 출력한다.
