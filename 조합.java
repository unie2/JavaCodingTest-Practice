/**
조합 (Combination)
: n개의 숫자 중에서 r개의 수를 순서 없이 뽑는 경우

ex) [1, 2, 3]에서 두개를 뽑는 경우
  - [1, 2]
  - [1, 3]
  - [2, 3]

**/

// "백트래킹"을 이용한 조합 구현
public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,3,4,5,6,7};
		boolean[] visited = new boolean[7];
		
		combination(arr, visited, 0, 6);
	}
	
	static void combination(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            print(arr, visited);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }
	
	static void print(int[] arr, boolean[] visited) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* 결과 */
/**
1 2 3 4 5 6 
1 2 3 4 5 7 
1 2 3 4 6 7 
1 2 3 5 6 7 
1 2 4 5 6 7 
1 3 4 5 6 7 
2 3 4 5 6 7 
**/

//---------------------------

// "재귀"를 이용한 조합 구현
public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,3,4,5,6,7};
		boolean[] visited = new boolean[7];
		
		combination(arr, visited, 0, 6);
	}
	
	static void combination(int[] arr, boolean[] visited, int depth, int r) {
        if (r == 0) {
        	print(arr, visited);
        	return;
        }
        
        if (depth == arr.length)
        	return;
        
        visited[depth] = true;
        combination(arr, visited, depth+1, r-1);
        visited[depth] = false;
        combination(arr, visited, depth+1, r);
    }
	
	static void print(int[] arr, boolean[] visited) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* 결과 */
/**
1 2 3 4 5 6 
1 2 3 4 5 7 
1 2 3 4 6 7 
1 2 3 5 6 7 
1 2 4 5 6 7 
1 3 4 5 6 7 
2 3 4 5 6 7 

**/
