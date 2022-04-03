import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[24];

		for (int i=0; i<n; i++) {
			data[sc.nextInt()] ++;
		}

		for (int i=1; i<=23; i++)
			System.out.print(data[i] + " ");
	}
}

/*
1. 출석 번호를 부른 횟수(n)를 입력받은 후 입력받은 횟수(테스트 케이스)인 n개의 번호를 입력받는다.
2. 1번부터 번호가 불린 횟수를 각각 출력하기 위해 배열을 이용하여 불린(입력받은) 번호를 배열의 인덱스로 설정하여 1씩 증가 시킨다. 
3. 문제에서 요구하는 출력 형식에 맞추어 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.

*/
