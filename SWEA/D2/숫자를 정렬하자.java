import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt();
			int[] data = new int[n];
			for (int i=0; i<n; i++) {
				data[i] = sc.nextInt();
			}
			
			Arrays.sort(data);
			System.out.print("#" + tc + " ");
			for (int i=0; i<n; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
	}
}

/*
1. 각 테스트 케이스마다 n개의 수를 입력받아 data 배열에 저장한다.
2. Arrays.sort() 를 통해 data 배열에 존재하는 요소들을 오름차순으로 정렬한다.
3. 최종적으로 해당 테스트 케이스 번호와 함께 정렬된 data 배열의 요소들을 출력한다.

*/
