import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int day = 0;
		for (int i=0; i<x-1; i++) {
			day += b[i];
		}
		int result = (day + y) % 7;
		System.out.println(a[result]);
	}
}

/*
1. 결과를 출력할 요일이 담긴 리스트 a와 일 수가 담긴 리스트 b를 정의한다.
2. 반복문을 통해 1월부터 입력받은 x월 까지의 일수를 day에 누적해나간다. (배열의 인덱스가 0부터 시작이므로 x-1로 지정)
3. 반복문이 종료되면 day 값에 입력받은 y를 더한 뒤, 요일은 총 7개로 구성되어있으므로 7로 나눈 나머지 값을 구해 result에 할당한다.
4. 최종적으로 리스트 a의 result 번째의 값을 출력한다.

*/
