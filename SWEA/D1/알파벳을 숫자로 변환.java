import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		
		for (int i=0; i<value.length(); i++) {
			int data = Integer.valueOf(value.charAt(i));
			System.out.print((data - 64) + " ");
		}
	}
}

// 1. 입력받은 문자열의 길이만큼 반복 수행하고, 각 알파벳을 아스키코드 값으로 변환한 후 64를 뺀 값을 출력한다.
