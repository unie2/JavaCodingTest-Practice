import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int[] diff_arr = new int[n-1];
		
		int first = sc.nextInt(); // 첫번째 가로수 위치
		data[0] = first;
		for (int i=1; i<n; i++) {
			int value = sc.nextInt();
			data[i] = value;
			diff_arr[i-1] = value - first;
			first = value;
		}
		
		int gcd_num = diff_arr[0];
		for (int i=1; i<diff_arr.length; i++) {
			gcd_num = gcd(gcd_num, diff_arr[i]);
		}
		
		int result = 0;
		for (int i=1; i<n; i++) {
			int diff = data[i] - data[i-1] -1;
			result += (int)(diff / gcd_num);
		}
		
		System.out.println(result);
	}
	
	static int gcd(int a, int b) {
		
		while (b != 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		
		return a;
	}
}

/*
1. n개의 가로수 위치를 data에 할당하고, 각 가로수마다 떨어져 있는 거리를 diff_arr에 할당한다.
2. 각 가로수마다 떨어져 있는 거리의 최대 공약수를 구하여 gcd_num에 할당한다.
3. 모든 가로수가 gcd_num 간격이 되도록 새로 심어야 하는 가로수의 개수를 구하여 출력한다.

*/
