// https://www.acmicpc.net/problem/15649

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] data = new int[N];
		for (int i=1; i<N+1; i++)
			data[i-1] = i;
		
		int[] output = new int[N];
		boolean[] visited = new boolean[N];
		permutations(data, output, visited, 0, N, M);
	}
	
	public static void permutations(int[] arr, int[] output, boolean visited[], int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}
		
		for (int i=0; i<n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				permutations(arr, output, visited, depth+1, n, r);
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


/*
1. N과 M을 입력받아 1부터 N까지의 수를 data 배열에 정의한다.
 
2. 순열(permutations)을 통해 각 경우의 수마다 M개의 수를 도출해내 해당 수들을 출력한다.

*/
