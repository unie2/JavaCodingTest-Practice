import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=n; i>=1; i--) 
			System.out.println(i);
	}
}

// 1. 자연수 n을 입력받아 반복문을 수행하여 n부터 1까지 한 줄에 하나씩 값을 출력한다.
