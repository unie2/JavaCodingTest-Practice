import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for (int i=0; i<n; i++) {
			int value = sc.nextInt();
			if (value == 1)
				continue;
			if (check_prime(value)) {
				result ++;
			}
		}
		
		System.out.println(result);
	}
	
	static boolean check_prime(int value) {
		for (int i=2; i<value; i++) {
			if (value % i == 0)
				return false;
		}
		
		return true;
	}
}

/*
1. n개의 수를 입력받는데, 하나의 정수 값에 대하여 소수인지 판별하고 소수라면 result 값을 1 증가시킨다.

2. 소수인지 판별하는 check_prime() 함수의 작업은 아래와 같다.
  - 2부터 value-1까지의 수를 각각 확인하는데, 그 값을 value에 나누었을 때 나누어 떨어진다면 소수가 아니므로 false를 반환한다.
  - 반복문이 모두 끝날때까지 false가 반환되지 않았다면 소수이므로 true를 반환한다.

*/
