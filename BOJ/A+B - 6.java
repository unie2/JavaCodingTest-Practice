import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			String str = sc.next();
			StringTokenizer st = new StringTokenizer(str, ",");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a + b);
		}
	}
}

/*
1. 각 테스트 케이스마다 문자열 형태로 입력받은 후  StringTokenizer를 통해 쉼표(,)를 기준으로 문자를 나눈다.
2. 나눈 문자를 정수형으로 변환하여 각 a와 b에 할당한 후 두 수의 합을 출력한다.

*/
