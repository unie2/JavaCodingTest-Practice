/* Case 1 : 메모리 310972KB, 시간 1708ms */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int min_value = 1000000;
		int max_value = -1000000;
		for (int i=0; i<n; i++) {
			int value = sc.nextInt();
			if (value < min_value)
				min_value = value;
			if (value > max_value)
				max_value = value;
		}
		
		System.out.print(min_value + " " + max_value);
	}
}


/* Case 2 : 메모리 324216KB, 시간 2556ms */
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for (int i=0; i<n; i++)
			data[i] = sc.nextInt();
		
		Arrays.sort(data);
		System.out.print(data[0] + " " + data[n-1]);
	}
}

/*
[Case 1]
1. 최소 값을 의미하는 min_value의 초기 값은 1000000으로 지정하고, 최대 값을 의미하는 max_value의 초기 값은 -1000000으로 지정한다.
2. n번의 반복 수행을 통해 값을 하나씩 입력받아 그 값이 min_value보다 작다면 min_value의 값을 그 값으로 갱신한다.
3. 마찬가지로 그 값이 max_value보다 크다면 max_value의 값을 그 값으로 갱신한다.
4. 최종적으로 문제에서 요구하는 출력 형식에 맞추어 최소 값(min_value)과 최대 값(max_value)을 출력한다.

[Case 2]
1. 입력받은 n개의 수를 배열 형태로 구성한다.
2. data 배열의 요소들을 오름차순으로 정렬한 후 최소 값을 의미하는 0번째 요소와 최대 값을 의미하는 n-1번째 요소를 출력한다.

*/
