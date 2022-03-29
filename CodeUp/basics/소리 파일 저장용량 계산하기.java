import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double h = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = sc.nextDouble();

		System.out.println(String.format("%.1f MB", (h*b*c*s)/8388608));
	}
}

/*
1. 문제에서 제시한 바와 같이 필요한 저장 공간을 MB 단위로 바꾸어 출력하기 위해 헤르쯔 * 비트 * 스테레오 * 초(시간) 을 모두 곱한 후 8,388,608 으로 나누어 출력한다.
2. 출력 시에는 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하도록 한다.

*/
