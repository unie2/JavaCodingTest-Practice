import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int result = 0;
			for (int i=0; i<10; i++) {
				int data = sc.nextInt();
				if (data % 2 == 1) {
					result += data;
				}
			}
			
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}

/*
1. 각 테스트 케이스마다 10개의 수를 입력받는데, 입력받은 하나의 값이 홀수일 경우 result에 그 값을 누적한다.
2. 10개의 수에 대한 처리가 모두 끝나면 최종적으로 해당 테스트 케이스 번호와 함께 result 값을 출력한다.

*/
