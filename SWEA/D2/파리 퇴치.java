import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int data[][] = new int[n][n];
			int result = 0;
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					data[i][j] = sc.nextInt();
				}
			}
			
			for (int k=0; k<n-m+1; k++) {
				for (int l=0; l<n-m+1; l++) {
					int temp = 0;
					for (int i=k; i<k+m; i++) {
						for (int j=l; j<l+m; j++) {
							temp += data[i][j];
						}
					}
					result = Math.max(result, temp);
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}

/*
1. 각 테스트 케이스마다 n x n 크기의 데이터를 입력받아 data 2차원 배열에 저장한다.
2. 4중 for문을 통해 (0, 0) 부터 (n-m, n-m) 까지 모든 좌표에 대한 m x m 크기의 영역을 확인하여 temp 변수에 누적한다.
3. result와 temp를 비교하여 더 큰 값을 result에 갱신한다.
4. 반복문 작업이 모두 끝나면 최종적으로 해당 테스트 케이스 번호와 함께 result 값을 출력한다.

*/
