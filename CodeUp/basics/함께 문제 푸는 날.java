import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int day = 1;

		while (day%a != 0 || day%b != 0 || day%c != 0)
			day ++;

		System.out.println(day);
	}
}

// 1. 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 각 방문 주기를 입력받은 후 3명이 다시 모두 함께 방문해 문제를 풀어보는 날을 출력한다.
