import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		int result = 0;
		for (int i=0; i<data.length(); i++) {
			int value = Character.getNumericValue(data.charAt(i));
			result += value;
		}
		
		System.out.println(result);
	}
}

/*
1. 자연수를 문자열 형태로 입력받아 각 자릿수를 정수형으로 변환하여 result 값에 누적한다.
2. 이후 반복문 수행이 종료되면 result 값을 출력한다.

*/
