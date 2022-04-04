import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] data = new int[20][20];

		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			data[x-1][y-1] = 1;
		}

		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
1. 바둑판을 다루기 위해 2차원 배열을 사용한다. 2차원 배열을 사용하면 가로번호, 세로번호를 통해 바둑판 형태의 문제를 쉽게 다룰 수 있다.
2. 바둑판에 올려 놓을 흰 돌의 개수(n)을 입력받은 후 n개의 흰 돌을 놓을 좌표(x, y)를 입력받는다.
3. 좌표를 입력받은 후에는 흰 돌이 있는 위치를 표시하기 위해 해당 위치 값을 1로 변경한다.
4. 이중 for문을 통해 19 * 19 크기의 흰 돌이 올려진 바둑판의 상황을 출력한다.

*/
