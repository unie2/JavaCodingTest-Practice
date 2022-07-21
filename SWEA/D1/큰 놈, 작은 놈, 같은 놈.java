import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String result = "";
			if (a == b)
				result = "=";
			else if (a > b)
				result = ">";
			else
				result = "<";
			
			System.out.println("#" + tc + " " + result);
		}
	}
}

/*
1. 각 테스트 케이스마다 2개의 수(a, b)를 입력받아 해당 테스트 케이스 번호와 함께 아래와 같이 출력한다.
  - a와 b의 값이 같을 경우 '='를 출력한다.
  - a의 값이 b의 값보다 작을 경우 '<'를 출력한다.
  - b의 값이 a의 값보다 작을 경우 '>'를 출력한다.

*/
