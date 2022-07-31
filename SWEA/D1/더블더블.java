import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int value = 1;
		for (int i=0; i<=n; i++) {
			System.out.print(value + " ");
			value *= 2;
		}
	}
}

/*
1. value를 1로 초기화한 후 주어진 횟수만큼 반복문을 수행한다.
2. 반복문 내부에서는 value값을 먼저 출력한 후 2를 곱한 값으로 갱신한다.

*/
