import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[11][11];
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int x = 2;
		int y = 2;
		while (true) {
			if (board[x][y] == 0) {
				board[x][y] = 9;
				y ++;
			}
			if (board[x][y] == 1) {
				y--;
				x++;
			}
			if (board[x][y] == 2) {
				board[x][y] = 9;
				break;
			} else if (board[x][y+1] == 1 && board[x+1][y] == 1) {
				if (board[x][y] == 0)
					board[x][y] = 9;
				break;
			}
		}

		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) 
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}
}

/*
1. 먼저 10 * 10 크기의 미로 상자의 구조와 먹이의 위치를 입력받는다.
2. 문제에서 개미는 (2, 2)에서 출발하기 때문에 초기 좌표 x, y 값을 각각 2로 설정한다.
3. while문 내에서는 해당 좌표가 0이라면 갈 수 있는 곳이기 때문에 해당 좌표의 값을 9로 변경한 후 오른쪽으로 움직이기 위해 y값을 1 증가시킨다.
4. 만약 해당 좌표가 1이라면 벽 또는 장애물로 인해 갈 수 없기 때문에 y값을 감소시켜 다시 되돌아온 후 아래쪽으로 이동하기 위해 x의 값을 증가시킨다.
5. 만약 해당 좌표가 2라면 먹이에 해당하기 때문에 해당 좌표를 9로 변경한 후 반복문을 빠져나온다. 
6. else if 문은 문제에서 제시한 바와 같이 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우에 더이상 이동하지 않고 그 곳에 머무르기 위해 작성한다.

*/
