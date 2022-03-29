import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String data[] = br.readLine().split(" ");
		int count = 0;

		int r = Integer.parseInt(data[0]);
		int g = Integer.parseInt(data[1]);
		int b = Integer.parseInt(data[2]);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i=0; i<r; i++) {
			for (int j=0; j<g; j++) {
				for (int k=0; k<b; k++) {
					bw.write(i + " " + j + " " + k + "\n");
					count ++;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
	}
}

/*
1. 일반적인 방식인 Scanner, System.out.println()을 사용하여 문제를 해결하면 시간 초과 판정을 받는다.
   그러므로, 데이터 처리 효율성을 높이기 위해 입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달될 수 있도록 BufferedReader와 BufferedWriter를 사용한다.
2. 입력 값을 공백을 기준으로 배열 형태로 구성하여 0번째 요소는 r에, 1번째 요소는 g에, 2번째 요소는 b에 할당한다.
3. 3중 for문을 통해 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합을 출력하고, count를 1씩 증가시킨다.
4. 반복문이 모두 끝나고 count 값을 출력한다.

*/
