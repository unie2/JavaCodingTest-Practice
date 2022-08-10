import java.util.*;
public class Main {
	
	static int[] target;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		target = new int[n];
		for (int i=0; i<n; i++)
			target[i] = sc.nextInt();
		Arrays.sort(target);
		
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int value = sc.nextInt();
			
			System.out.println(search(value, 0, n-1));
		}
	}
	
	static int search(int value, int start, int end) {
		if (start > end) {
			return 0;
		}
		int mid = (start + end) / 2;
		if (target[mid] == value) {
			return 1;
		} else if (value < target[mid]) {
			return search(value, start, mid - 1);
		} else {
			return search(value, mid + 1, end);
		}
	}

}

/*
1. n개의 정수를 target 배열에 담은 후 Arrays.sort()를 통해 오름차순으로 정렬한다. (정렬은 이분 탐색을 위해 수행)

2. m개의 값을 입력받는데, 하나의 값을 입력받을 때마다 search() 함수를 호출하여 반환받은 값을 출력한다.

3. 이분 탐색을 수행하기 위한 search() 함수의 작업은 아래와 같다.
  - 만약 start 값이 end 값보다 클 경우 더 이상 탐색할 데이터가 없고 찾고자 하는 데이터(value)값이 target 배열에 없으므로 0을 반환한다.
  - (start + end) / 2 를 구하여 찾고자 하는 범위에서의 중간 값을 구해 mid에 할당한다.
  - 만약 target[mid] 값이 찾고자 하는 값(value)이 같을 경우 1을 반환한다.
  - 그렇지 않고 value가 target[mid] 보다 작을 경우 다시 왼쪽 범위에 대한 탐색을 수행해야 하므로 end 값을 mid - 1로 설정하여 search() 함수를 재귀호출한다.
  - 그렇지 않고 value가 target[mid] 보다 클 경우 다시 오른쪽 범위에 대한 탐색을 수행해야 하므로 start 값을 mid + 1로 설정하여 search() 함수를 재귀호출한다.

*/
