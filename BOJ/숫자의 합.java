import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int result = 0 ;
		
		for (int i=0; i<str.length(); i++) {
			result += str.charAt(i) - '0';
		}
		
		System.out.println(result);
	}
}

/*
1. 숫자 n개를 문자열 형태로 입력받는다.
2. 문자열의 길이만큼 반복문을 수행하고, 해당 문자를 하나씩 확인하여 정수형으로 변환하여 result에 누적한다.
3. 모든 문자를 확인하면 최종적으로 result 값을 출력한다.

*/
