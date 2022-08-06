import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc=1; tc<=t; tc++) {
			int hour_1 = sc.nextInt();
			int minute_1 = sc.nextInt();
			int hour_2 = sc.nextInt();
			int minute_2 = sc.nextInt();
			
			int sum_minute = (minute_1 + minute_2) % 60;
			int sum_hour = hour_1 + hour_2 + (int)((minute_1 + minute_2) / 60);
			sum_hour %= 12;
			if (sum_hour == 0)
				sum_hour = 12;
			
			System.out.println("#" + tc + " " + sum_hour + " " + sum_minute);
		}
	}
}

/*
1. 각 테스트 케이스마다 두 시각을 입력받아 아래와 같이 연산 작업을 수행한다.
  - 분에 해당하는 두 값을 더하여 60으로 나눈 나머지 값을 sum_minute에 할당한다.
  - 시에 해당하는 두 값을 더하고, ((minute_1 + minute_2) / 60) 을 더한다.

2. sum_hour을 12로 나눈 나머지 값으로 갱신하는데, 이때 sum_hour 값이 0일 경우 12로 갱신한다.

3. 최종적으로 해당 테스트 케이스 번호와 함께 시각(sum_hour, sum_minute)을 출력한다.

*/
