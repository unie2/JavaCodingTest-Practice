import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = 0;
		for (int i=1; i<=n; i++) {
			result += i;
		}
		
		System.out.println(result);
	}
}

// 1. 반복문을 통해 1부터 입력받은 수까지 값을 result에 누적시키고, 반복문 작업을 마치면 result 값을 출력한다.
