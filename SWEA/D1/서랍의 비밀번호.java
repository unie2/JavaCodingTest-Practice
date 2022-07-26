import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(Math.abs(p - k) + 1);
	}
}

// 1. p와 k를 정수형으로 입력받은 후 Math.abs()를 통해 두 수의 차를 구하고 1을 더한 값을 출력한다.
