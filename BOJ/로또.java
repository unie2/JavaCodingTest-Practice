import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int k = sc.nextInt();
			if (k == 0)
				break;
			int[] arr = new int[k];
			for (int i=0; i<k; i++)
				arr[i] = sc.nextInt();
			boolean[] visited = new boolean[k];
			
			combination(arr, visited, 0, 6);
			System.out.println();
		}
	}
	
	static void combination(int[] arr, boolean[] visited, int start, int r) {
		if (r == 0) {
			print(arr, visited);
			return;
		}
		
		for (int i=start; i<arr.length; i++) {
			visited[i] = true;
			combination(arr, visited, i+1, r-1);
			visited[i] = false;
		}
	}
	
	static void print(int[] arr, boolean[] visited) {
		for (int i=0; i<arr.length; i++) {
			if (visited[i] == true) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}

/*
1. 백트래킹을 이용하여 6개의 수를 도출해내는 조합을 구현하였다.

2. while문 내부에 k를 입력받고, 만약 k 값이 0이라면 break한다.

3. k가 0이 아니라면 k개의 수를 arr 배열에 담고 boolean 타입의 데이터가 담겨있는 visited와 함께 combination() 함수 매개변수로 하여 호출한다.

4. combination() 함수의 작업은 아래와 같다.
  - 만약 전달받은 r 값이 0일 경우 6개의 값을 모두 도출하였으므로, print() 함수를 통해 데이터들을 출력한 뒤 return 한다.
  - 반복문의 시작값을 start로 지정하고, visited[i]를 true하여 방문처리를 해준 뒤 combination() 함수를 재귀호출한다.
  - 이때 현재 확인하고 있는 값의 다음 값부터 확인할 수 있도록 start 매개변수 위치에 1을 증가한 값(i+1)을 설정하고, 하나의 값을 뽑아냈으므로 r 매개변수 위치에 r-1을 설정하여 호출한다.
  - combination() 함수를 재귀호출한 후 다른 방법 또한 도출해야하므로 visited[i] 값을 false로 다시 갱신한다.

5. print() 함수의 작업은 아래와 같다.
  - 전달받은 arr 배열의 데이터의 방문 여부를 확인하여 true라면 arr[i] 값을 출력한다.

*/
