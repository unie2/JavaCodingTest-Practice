import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char data = sc.next().charAt(0);

			System.out.println(data);
			if (data == 'q')
				break;
		}
	}
}

// 1. while문을 통해 문자를 입력받아 하나씩 출력하고, 현재의 문자가 'q'일 경우 반복문을 빠져나온다.
