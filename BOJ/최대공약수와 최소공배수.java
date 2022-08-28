import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int mul = a * b;
		
		while (b != 0) {
			a = a % b;
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a);
		System.out.println((int) mul / a);
	}
	
}

/*
1. 반복문을 통해 최대공약수를 먼저 구하도록 한다. 두 수 a와 b가 있을 때 a, b의 최대 공약수는 b와 a를 b로 나눈 나머지 값의 최대공약수와 같다.

2. 최대공약수를 구하고 그 값을 통해 최소공배수를 구할 수 있다. 최소 공배수는 a로 나눠도 나누어 떨어지고
   b로 나눠도 나누어 떨어지기 때문에 입력받은 원래의 값 a, b를 곱하고 이전에 구했던 최대공약수로 나누어 출력한다.

*/
