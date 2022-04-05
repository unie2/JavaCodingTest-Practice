import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] board = new int[h][w];
		
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j=0; j<l; j++) {
				if (d == 0) // 가로
					board[x-1][y-1+j] = 1;
				else
					board[x-1+j][y-1] = 1;
			}
		}

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
1. 격자판의 세로(h), 가로(w)를 입력받고 놓을 수 있는 막대의 개수(n) 또한 입력받는다.
2. 첫번째 반복문 내에서는 입력받은 막대의 개수만큼 막대의 길이(l), 방향(d), 좌표(x, y)를 입력받고 방향이 가로일 경우 x의 값은 유지하되 y를 증가시키면서 해당 인덱스의 값을 1로 갱신한다.
3. 반대로 세로일 경우 y의 값은 유지하되 x를 증가시키면서 해당 인덱스의 값을 1로 갱신한다.

*/
