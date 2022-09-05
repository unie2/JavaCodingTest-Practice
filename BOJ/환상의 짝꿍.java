import java.io.*;
import java.util.*;

public class Main {
	static final int MAX = 2000000;
	static boolean[] data = new boolean[MAX+1];
	static List<Integer> primes = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		Arrays.fill(data, true);
		data[0] = data[1] = false;
		for (int i=2; i<MAX+1; i++) {
			if (data[i]) {
				primes.add(i);
				for (int j=i+i; j<MAX+1; j=j+i) {
					data[j] = false;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for (int tc=0; tc<t; tc++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long sum = a + b;
			
			if (sum < 4) {
				bw.write("NO\n");
			} else if (sum % 2 == 0) {
				bw.write("YES\n");
			} else {
				if (is_prime(sum-2)) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static boolean is_prime(long value) {
		if (value <= MAX)
			return data[(int) value];
		
		for (int i=0; i<primes.size(); i++) {
			if (value % primes.get(i) == 0)
				return false;
		}
		
		return true;
	}
}

/*
1. 에라토스테네스의 체 알고리즘을 통해 2,000,000까지의 수 중 소수인 수를 primes 리스트에 저장한다.

2. a와 b의 합을 sum에 저장하고, 그 값이 4보다 작다면 소수로 나눌 수 없으므로 'NO'를 출력한다.

3. 그렇지 않고, 값이 4 이상이고 짝수일 경우 무조건 소수로 나눌 수 있으므로 'YES'를 출력한다. (골드바흐의 추측)

4. 이 외 홀수 소수는 2와 홀수 소수의 조합으로만 가능하므로 is_prime() 함수를 통해 sum - 2 값이 소수인지 판별하고, 소수라면 'YES'를, 아니라면 'NO'를 출력한다.

5. 특정 값이 소수인지 판별하는 is_prime() 함수의 작업은 아래와 같다.
  - 만약 값이 최대 값(max_value)보다 큰 경우 해당 수가 소수로 나누어 떨어지는지 확인하고, 나누어 떨어진다면 소수가 아니므로 false를, 나누어 떨어지는 수가 없으면 true를 반환한다.
  - 값이 최대 값 이하인 경우 정의했던 소수 여부 배열(data)에서 해당 값이 소수인지 아닌지에 대한 여부를 반환한다.

*/
