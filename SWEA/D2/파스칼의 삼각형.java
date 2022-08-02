import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			int[][] data = new int[n][n];
			for (int i=0; i<n; i++) {
				data[i][0] = 1;
				data[i][n-1] = 1;
			}
			
			for (int i=1; i<n; i++) {
				for (int j=1; j<n; j++) {
					if (data[i][j] == 0)
						data[i][j] = data[i-1][j-1] + data[i-1][j];
				}
			}
			
			System.out.println("#" + tc);
			for (int i=0; i<n; i++) {
				for (int j=0; j<i+1; j++) {
					if (data[i][j] != 0) {
						System.out.print(data[i][j] + " ");
					}
				}
				System.out.println();
			}
			
		}
	}
}

/*
1. 각 테스트 케이스마다 n x n 크기의 2차원 배열 data를 정의하고, data[i][0] 과 data[i][n-1] 값을 1로 설정한다.
2. 이중 for문을 통해 data[i][j] 값을 갱신하는데, 값이 0일 경우에만 수행하며 data[i-1][j-1] + data[i-1][j] 를 계산하여 갱신한다.
3. 이중 for문을 통해 데이터를 하나씩 출력하는데, 이때 내부 반복문의 종료 조건을 i+1로 설정한다.

*/
