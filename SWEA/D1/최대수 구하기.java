import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int max_value = 0;
			for (int i=0; i<10; i++) {
				int data = sc.nextInt();
				if (max_value < data)
					max_value = data;
			}
			
			System.out.println("#" + tc + " " + max_value);
		}
	}
}

/*
1. 각 테스트 케이스마다 10개의 수를 입력받는데, 입력된 하나의 값이 현재의 max_value 값보다 클 경우 최댓값으로 갱신한다.
2. 10개의 입력 값에 대한 처리 작업이 모두 끝나면 최종적으로 해당 테스트 케이스 번호와 함께 max_value를 출력한다.

*/
