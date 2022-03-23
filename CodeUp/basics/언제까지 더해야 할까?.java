import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();
		int num = 0;
		int sum_value = 0;
		
		while (true) {
			num += 1;
			sum_value += num;
			if (sum_value >= target)
				break;
		}

		System.out.println(num);
	}
}

/*
1. 반복문 내에서 더할 숫자 num을 1증가시킨 후 sum_value에 누적해나간다.
2. 만약 sum_value가 입력받은 target값보다 같거나 크다면 반복문을 종료하고 num 값을 출력한다.

*/
