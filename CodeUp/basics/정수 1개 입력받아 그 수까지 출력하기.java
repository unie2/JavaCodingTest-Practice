import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		for(int i=0; i<=value; i++)
			System.out.println(i);
	}
}

/*
1. 정수 1개를 입력받은 후 0부터 입력받은 해당 값까지 순서대로 출력한다.
2. 단순히 반복문을 통해 시작값을 0으로 설정하여 차례대로 출력한다.

*/
