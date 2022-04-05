import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[20][20];

		for (int i=1; i<=19; i++) {
			for (int j=1; j<=19; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j=1; j<=19; j++) {
				if (board[x][j] == 0)
					board[x][j] = 1;
				else
					board[x][j] = 0;
			}
			for (int j=1; j<=19; j++) {
				if (board[j][y] == 0)
					board[j][y] = 1;
				else
					board[j][y] = 0;
			}
		}

		for (int i=1; i<=19; i++) {
			for (int j=1; j<=19; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
1. 바둑판을 다루기 위해 2차원 배열을 사용한다. 2차원 배열을 사용하면 가로번호, 세로번호를 통해 바둑판 형태의 문제를 쉽게 다룰 수 있다.
2. 첫번째 반복문을 통해 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력되도록 한다.
3. 이후 십자 뒤집기 횟수를 의미하는 n을 입력받은 후 두번째 반복문을 통해 십자 뒤집기 좌표가 횟수(n) 만큼 입력되도록 한다.
4. 또한, 입력받은 좌표를 기준으로 가로 줄과 세로 줄의 흑돌 혹은 백돌을 반대로 뒤집는다.

*/
