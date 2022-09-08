import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		long size = max-min + 1;
		
		boolean[] visited = new boolean[(int)size];
		long i = 2;
		while (i * i <= max) {
			long value = i * i;
			int remain = 0;
			if (min % value != 0) {
				remain = 1;
			}
			
			long data = (min / value) + remain;
			while (value * data <= max) {
				if (!visited[(int)(value * data - min)]) {
					visited[(int)(value * data - min)] = true;
					size -= 1;
				}
				data += 1;
			}
			
			i += 1;
		}
		
		System.out.println(size);
	}
}

/*
1. 에라토스테네스의 체 알고리즘을 통해 제곱 수들을 true로 변경해주고, 입력받은 min, max 사이의 값 중 false로 유지된 수의 개수를 구하여 문제를 해결할 수 있다.

2. 가장 초기에 min, max 값을 입력받고 max - min + 1을 통해 실제 확인해야 하는 수의 개수를 구하여 size에 할당한다.

3. i를 2로 초기화해주고 i의 제곱수가 max보다 커질 때까지 아래와 같은 작업을 반복 수행한다.
  - i의 제곱 수를 구해 value에 할당한다.
  - 만약 min을 value로 나누었을 때 나누어 떨어지면 remain에 0을, 그렇지 않으면 1을 할당한다.
  - min을 value로 나눈 몫과 remain을 더하여 data에 할당함으로써 현재 제곱 수에 대하여 어느 값부터 확인할지 정한다. (아래 예시 참고)
    *****
      [예시]
      min = 11, max = 20

      2의 제곱수: 4
      min // 4 : 2
      min % 4 : 3 이므로
      배수는 2(몫) + 1(보정) = 3

      즉, 11보다 큰 4의 배수인 4 * 3 = 12
    *****
  - value와 data의 곱이 max보다 커질 때까지 제곱수들의 visited(false) 값을 true로 변경하고 size를 1 감소시키고, data를 1씩 증가시킨다.
  - 한 작업이 끝날 때마다 다음 제곱 수를 확인해야하므로 i를 1씩 증가시킨다.

4. 최종적으로 size값을 출력한다.

*/
