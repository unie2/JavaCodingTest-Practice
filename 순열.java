/**
순열 (Permutation)

ex) [1, 2, 3]에서 두개를 뽑는 경우
  - [1, 2]
  - [1, 3]
  - [2, 1]
  - [2, 3]
  - [3, 1]
  - [3, 2]
  
**/

// "백트래킹"을 이용한 순열 구현 : n개의 숫자 중에서 r개의 수를 순서대로 뽑는 경우
public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {1, 2, 3};
		boolean[] visited = new boolean[3];
		int[] output = new int[3];
		
		permutation(arr, output, visited, 0, 3, 2);
	}
	
	public static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}
		
		for (int i=0; i<n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation(arr, output, visited, depth+1, n, r);
				visited[i] = false;
			}
		}
	}
	
	public static void print(int[] arr, int r) {
		for (int i=0; i<r; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

/* 결과 */
/**
1 2 
1 3 
2 1 
2 3 
3 1 
3 2 
**/


