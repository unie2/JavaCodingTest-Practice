import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			String data = sc.next();
			char start_str = data.charAt(0);
			int end_index = 0;
			
			for (int i=1; i<data.length(); i++) {
				if (data.charAt(i) != start_str) {
					end_index = i;
				} else {
					if (data.substring(0, end_index+1).equals(data.substring(end_index+1, end_index+end_index+2))) {
						System.out.printf("#%d %d\n", tc, end_index + 1);
						break;
					}
				}
			}
		}
	}
}

/*
1. 각 테스트 케이스마다 문자열을 입력받아 1부터 문자열의 길이까지를 반복문의 범위로 지정한다.
2. 만약 현재 확인하고 있는 문자가 0번째 문자와 같다면 (3) 번을 수행한다.
3. 가장 첫 문자부터 i번째 문자까지의 문자열과 i번째 문자부터 i*2번째 문자까지의 문자열이 같다면 (end_index+1)값을 출력한 뒤 break한다.
4. 만약 현재 확인하고 있는 문자가 0번째 문자와 같다면 end_index 값에 i를 할당하여 끝 문자 인덱스를 갱신한다.

*/
