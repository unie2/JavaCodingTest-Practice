import java.io.*;
import java.util.*;

public class Main {
	static int[][] data;
	static List<int[]> empty_list;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		data = new int[9][9];
		empty_list = new ArrayList<>();
		
		for (int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<9; j++) {
				int value = Integer.parseInt(st.nextToken());
				data[i][j] = value;
				if (value == 0) {
					int[] arr = {i, j};
					empty_list.add(arr);
				}
			}
		}
		
		dfs(0);
	}
	
	static void dfs(int index) {
		if (index == empty_list.size()) {
			for (int i=0; i<9; i++) {
				for (int j=0; j<9; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}
			
			System.exit(0);
		}
		
		for (int num=1; num<10; num++) {
			int x = empty_list.get(index)[0];
			int y = empty_list.get(index)[1];
			if (check_row(x, num) && check_col(y, num) && check_part(x, y, num)) {
				data[x][y] = num;
				dfs(index + 1);
				data[x][y] = 0;
			}
		}
	}
	
	static boolean check_row(int x, int num) {
		for (int i=0; i<9; i++) {
			if (data[x][i] == num)
				return false;
		}
		return true;
	}
	
	static boolean check_col(int y, int num) {
		for (int i=0; i<9; i++) {
			if (data[i][y] == num)
				return false;
		}
		return true;
	}
	
	static boolean check_part(int x, int y, int num) {
		int nx = x / 3 * 3;
		int ny = y / 3 * 3;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (data[nx+i][ny+j] == num)
					return false;
			}
		}
		
		return true;
	}
}

/*
1. 9 x 9 크기의 격자판에서 0으로 입력된 좌표들을 empty_list에 할당하고, dfs() 함수를 호출한다.

2. dfs() 함수의 작업은 아래와 같다.
  - 만약 0으로 입력된 좌표의 개수(empty_list의 개수)와 index 값이 같다면 모든 좌표에 대한 갱신이 이루어졌으므로 격자판 상태를 출력하고 시스템을 종료한다.
  - 그렇지 않을 경우 empty_list의 index 번째 값(좌표)을 가져와 해당 위치를 기준으로 행, 열, 3 x 3 크기의 격자판 상태를 확인한다.
  - 이때 특정 숫자를 삽입하는 것에 대하여 세 가지의 방식에서 모두 true를 반환받았다면 해당 위치에 숫자를 삽입하고 dfs() 함수를 재귀호출한 뒤 해당 위치를 다시 0으로 갱신한다.

3. 특정 위치를 기준으로 3 x 3 크기의 격자판 상태를 확인하는 check_part() 함수의 작업은 아래와 같다.
  - 3 x 3 크기의 격자판 상태를 확인하는 가장 초기 값을 구해 각 nx, ny에 할당한다.
  - 각 위치의 값을 확인하여 그 값이 num과 같다면 숫자 num을 놓을 수 없으므로 false를 반환하고, 그렇지 않을 경우 true를 반환한다.

*/
