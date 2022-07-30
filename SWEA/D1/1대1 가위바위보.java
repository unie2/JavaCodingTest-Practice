import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}

// 1. a와 b를 입력받고, 만약 a가 b보다 더 크면 "A"를, b가 a보다 더 크면 "B"를 출력한다.
