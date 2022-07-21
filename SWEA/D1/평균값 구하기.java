/* Case 1 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int sum = 0;
			for (int i=0; i<10; i++) {
				int data = sc.nextInt();
				sum += data;
			}
			
			int avg = sum / 10;
			if (sum % 10 >= 5)
				avg ++;
			System.out.printf("#%d %d\n", tc, avg);
		}
	}
}

/*
1. 각 테스트 케이스마다 10개의 값을 입력받아 sum에 누적한다.
2. sum을 10으로 나눈 값을 정수형으로 avg에 할당하고, 소수점 자리 값이 5이상일 경우 avg 값을 1 증가시킨다.
3. 최종적으로 해당 테스트 케이스 번호와 함께 avg 값을 출력한다.
4. 위 방법 이 외에 아래와 같은 방법으로도 문제 해결이 가능하다.

*/

/* Case 2 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			double sum = 0;
			for (int i=0; i<10; i++) {
				int data = sc.nextInt();
				sum += data;
			}
			
			double avg = Math.round(sum / 10);
			System.out.println("#" + tc + " " + (int)avg);
		}
	}
}
