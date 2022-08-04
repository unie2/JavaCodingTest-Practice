import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int sum = 0;
			int max_value = 0;
			int min_value = 10000;
			for (int i=0; i<10; i++) {
				int value = sc.nextInt();
				sum += value;
				max_value = Math.max(max_value, value);
				min_value = Math.min(min_value, value);
			}
			
			sum -= max_value;
			sum -= min_value;
			
			int result = (int)Math.round(sum / 8.0);
			System.out.println("#" + tc + " " + result);
		}
	}
}

/*
1. 각 테스트 케이스마다 10개의 수를 입력받는데, 하나의 수를 입력받을 때마다 sum에 그 값을 누적하고, max_value와 min_value와 각각 비교하여 최댓값, 최솟값을 갱신한다.
2. sum 값에서 max_value와 min_value의 값을 감소시킨다.
3. sum 값을 8로 나눈 값을 정수형으로 하여 result에 할당하고, 해당 테스트 케이스 번호와 함께 result 값을 출력한다.

*/
