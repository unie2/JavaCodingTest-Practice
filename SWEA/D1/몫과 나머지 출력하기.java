import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("#" + tc + " " + (int)(a/b) + " " + (int)(a%b));
		}
	}
}

// 1. a와 b를 입력받아 각 테스트 케이스 번호와 함께 a를 b로 나눈 몫과 나머지 값을 출력 형식에 맞추어 출력한다.
