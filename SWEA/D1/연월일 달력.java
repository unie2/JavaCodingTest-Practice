import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int tc=1; tc<=t; tc++) {
			String data = sc.next();
			String year = data.substring(0, 4);
			String month = data.substring(4, 6);
			String day = data.substring(6, 8);
			
			String result = "-1";
			if (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= days[Integer.parseInt(month)]) {
				result = (year+"/"+month+"/"+day);
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}

/*
1. 1월부터 12월까지 각 달에 해당하는 날짜까지의 정보를 담은 days 배열을 정의한다.
2. 입력받은 값에 substring()을 적용시켜 각 연도, 월, 일을 year, month, day에 할당한다.
3. day를 정수형으로 변환한 값이 1 이상이고 정수형 month를 인덱스로한 days 값 이하일 경우 result를 "yyyy/mm/dd" 형태로 갱신한다.
4. 최종적으로 해당 테스트 케이스 번호와 함께 result 값을 출력한다.

*/
