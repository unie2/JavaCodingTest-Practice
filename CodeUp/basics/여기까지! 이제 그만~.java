import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();
		int num = 1;
		int sum_value = 0;
		while (true) {
			sum_value += num;
			if (sum_value >= target)
				break;
			num ++;
		}
		System.out.println(sum_value);
	}
}

/*
1. while문을 통해 sum_value에 num 값을 누적한다.
2. 만약 sum_value가 입력받은 target보다 크거나 같을 경우 반복문을 빠져나온다.
3. 그렇지 않을 경우 num 값을 1씩 증가시킨다.
4. 반복문을 빠져나오면 최종적으로 sum_value 값을 출력한다.

*/
