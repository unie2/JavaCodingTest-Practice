import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			int result = 1;
			for (int i=2; i<=n; i++) {
				if (i % 2 == 0) {
					result -= i;
				} else {
					result += i;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}

/*
1. 각 테스트 케이스마다 result를 1로 초기화한다.
2. 2부터 n까지 숫자를 각각 확인하여 그 값이 짝수라면 result에서 해당 값을 빼고, 홀수라면 해당 값을 더한다.
3. 최종적으로 해당 테스트 케이스 번호와 함께 result 값을 출력한다.

*/
