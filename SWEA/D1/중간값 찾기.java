import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		
		n = n/2;
		System.out.println(data[n]);
	}
}

/*
1. n개의 수를 배열 형태로 구성하고 중간값을 찾기 위해 오름차순으로 정렬한다.

2. n을 2로 나눠 중간 값 인덱스를 구한다.

3. 최종적으로 n을 인덱스로 가지는 data 배열 값을 출력한다.

*/
