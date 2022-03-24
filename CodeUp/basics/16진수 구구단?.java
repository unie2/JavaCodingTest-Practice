import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String value = sc.next();
		int num = Integer.parseInt(value, 16);

		for (int i=1; i<16; i++)
			System.out.format("%X*%X=%X\n", num, i, num*i);
		
	}
}

/*
1. 입력받은 문자 value를 16진수로 변환하여 num에 할당한다.
2. 반복문을 통해 16진수 구구단을 출력하는데, format을 통해 문제에서 요구하는 출력형식에 맞추어 출력이 가능하다.

*/
