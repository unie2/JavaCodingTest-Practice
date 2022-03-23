import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();
		int result = 0;
		for (int i=1; i<=value; i++){
			if (i % 2 == 0)
				result += i;
		}

		System.out.println(result);
	}
}

/*
1. 반복문을 통해 1부터 입력받은 value 값까지 짝수의 합을 구하여 result에 누적해나간다.
2. 반복문이 종료되면 result 값을 그대로 출력한다.

*/
