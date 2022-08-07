import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc=1; tc<=t; tc++) {
			int num = sc.nextInt();
			int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int[] result = new int[8];
			
			for (int i=0; i<8; i++) {
				result[i] = num / moneys[i];
				num %= moneys[i];
			}
			
			System.out.println("#" + tc);
			for (int i=0; i<8; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}
}

/*
1. 각 테스트 케이스마다 화폐를 담은 moneys 배열과 사용한 돈의 개수를 저장할 result 배열을 정의한다.
2. 화폐를 하나씩 확인하여 현재의 금액(num)에서 해당 화폐로 나눈 값을 result[i]에 할당하고, num을 갱신한다.
3. 최종적으로 해당 테스트 케이스 번호와 함께 각 화폐마다 사용된 개수를 출력한다.

*/
