import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] k = new int[n];
		for (int i=0; i<n; i++)
			k[i] = sc.nextInt();

		int min_value = 23;
		for (int i=0; i<n; i++) {
			if (min_value > k[i])
				min_value = k[i];
		}
		System.out.println(min_value);
	}
}

/*
1. 문제에서 입력되는 번호의 범위가 1~23 이고 그 중 최소값을 구해야하기 때문에 변수 min_value의 초기값을 23으로 지정한다.
2. 반복문을 통해 k 배열의 요소를 하나씩 확인하여 min_value보다 작을 경우 min_value를 k[i] 값으로 갱신한다.
3. 반복문이 종료되면 최종적으로 min_value를 출력한다.

*/
