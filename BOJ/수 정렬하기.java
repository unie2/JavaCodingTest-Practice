import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i=0; i<n; i++)
			data[i] = sc.nextInt();
		
		Arrays.sort(data);
		for (int i=0; i<n; i++) 
			System.out.println(data[i]);
	}
}

// 1. n개의 값을 입력받아 data 배열에 담은 후 Arrays.sort() 를 통해 오름차순으로 정렬한다.
// 2. 정렬된 값을 for문을 통해 하나씩 출력한다.
