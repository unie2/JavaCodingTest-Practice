import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] data = new int[n][n];
			
			int result = 0;
			for (int i=0; i<n; i++) { // 입력 및 가로 확인
				int temp_cnt = 0;
				for (int j=0; j<n; j++) {
					data[i][j] = sc.nextInt();
					if (data[i][j] == 1) {
						temp_cnt ++;
					} 
					if (data[i][j] == 0 || j == n - 1){
						if (temp_cnt == k) {
							result ++;
						}
						if (data[i][j] == 0)
							temp_cnt = 0;
					}
				}
			}

			for (int i=0; i<n; i++) { // 세로 확인
				int temp_cnt = 0;
				for (int j=0; j<n; j++) {
					if (data[j][i] == 1) {
						temp_cnt ++;
					} 
					if (data[j][i] == 0 || j == n - 1){
						if (temp_cnt == k) {
							result ++;
						}
						if (data[j][i] == 0)
							temp_cnt = 0;
					}
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}

/*
1. 각 테스트 케이스마다 n과 k를 입력받고, 퍼즐의 상태를 입력받아 data 2차원 배열을 정의한다.

2. 입력받는 과정에서 가로의 상황을 함께 확인한다. 해당 작업 과정은 아래와 같다.
  - 2중 for문을 통해 data[i][j]를 확인하며, 해당 값이 1일 경우 temp_cnt를 1 증가 시킨다.
  - 만약 현재의 값이 0이거나 마지막 열일 경우 temp_cnt 값을 확인하고 temp_cnt 값이 k와 같을 경우 result를 1 증가 시킨다.
  - 이후 현재의 값(data[i][j])이 0일 경우 temp_cnt를 다시 0으로 초기화한다.

3. 가로의 상황을 확인한 뒤 세로의 상황을 확인한다. 해당 작업 과정은 아래와 같다.
  - 2중 for문을 통해 data[i][j]를 확인하며, 해당 값이 1일 경우 temp_cnt를 1 증가 시킨다.
  - 만약 현재의 값이 0이거나 마지막 행일 경우 temp_cnt 값을 확인하고 temp_cnt 값이 k와 같을 경우 result를 1 증가 시킨다.
  - 이후 현재의 값이 0일 경우 temp_cnt를 다시 0으로 초기화한다.

4. 최종적으로 해당 테스트 케이스 번호와 함께 result 값을 출력한다.

*/
