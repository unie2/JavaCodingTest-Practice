import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i=m; i<=n; i++) {
			if (check_prime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean check_prime(int value) {
		if (value == 1)
			return false;
		for (int i=2; i<=Math.pow(value, 0.5); i++) {
			if (value % i == 0)
				return false;
		}
		
		return true;
	}
}

/*
1. 두 수를 입력받아 m부터 n까지의 수 중 소수를 구하는 문제이다.

2. 소수를 판별하여 반환해주는 prime_number( ) 함수에서는 전달받은 수를 먼저 확인하여 그 값이 1이라면
    소수가 아니기 때문에 false를 반환하고 그렇지 않는다면 반복문을 통해 소수임을 판별한다.

3. 반복문의 범위는 2부터 전달받은 값의 제곱근까지로 정의하여 판별하고 전달 받은 값이 소수라면 true를, 
    소수가 아니라면 false를 반환하여 true인 값만 화면에 출력한다.

*/
