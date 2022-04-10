import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String str = sc.nextLine();
			
			System.out.println(str);
		}
	}
}

/*
1. while문의 조건으로 hasNext()를 포함시켜줌으로써 예외 처리를 수행한다.
2. 반복문 내부에서는 문자열을 입력받아 그대로 출력한다.

*/
