import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			String data = sc.next();
			StringBuffer sb = new StringBuffer(data);
			String reversed_data = sb.reverse().toString();
			if (data.equals(reversed_data)) {
				System.out.println("#" + tc + " " + 1);
			} else {
				System.out.println("#" + tc + " " + 0);
			}
		}
	}
}

// 1. 각 테스트 케이스마다 문자열 data를 입력받고, StringBuffer()를 통해 data 문자열을 뒤집은 값을 reversed_data에 할당한다.
// 2. 만약 data 문자열과 reversed_data 문자열이 같을 경우 해당 테스트 케이스 번호와 함께 1을 출력하고, 그렇지 않을 경우 0을 출력한다.
