import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=t; tc++) {
			String order = br.readLine();
			int p = Integer.parseInt(br.readLine());
			String data = br.readLine();
			String[] str = new String(data.substring(1, data.length()-1)).split(",");
			
			List<String> list = new ArrayList<>();
			for (int i=0; i<p; i++) {
				list.add(str[i]);
			}
			
			int reverse = 0;
			boolean flag = true;
			for (int i=0; i<order.length(); i++) {
				char o = order.charAt(i);
				if (o == 'R') {
					// 뒤집기
					reverse ++;
				} else if (o == 'D') {
					// 제거
					if (list.size() > 0) {
						if (reverse % 2 == 0) {
							// 그대로
							list.remove(0);
						} else {
							// 거꾸로
							list.remove(list.size()-1);
						}
					} else {
						flag = false;
						System.out.println("error");
						break;
					}
				}
			}
			
			if (flag == true) {
				if (reverse % 2 == 0) {
					// 그대로
					StringJoiner sj = new StringJoiner(",");
					for (int i=0; i<list.size(); i++)
						sj.add(list.get(i));
					System.out.println("[" + sj + "]");
				} else {
					// 거꾸로
					StringJoiner sj = new StringJoiner(",");
					for (int i=list.size()-1; i>=0; i--) 
						sj.add(list.get(i));
					System.out.println("[" + sj + "]");
				}
			}
			
		}
	}
}

/*
1. 입력받은 배열의 괄호([, ])를 제외하여 "," 로 구분하여 str에 저장한 후, 하나씩 list 리스트에 저장한다.
2. 입력받은 p의 값을 하나씩 확인하는데, 만약 그 값이 'R'일 경우 reverse를 1 증가시킨다.
3. 그 값이 'D'이고 list에 값이 존재하며, reverse 값이 짝수일 경우 입력받은 그대로 수행하면 되므로 가장 앞 요소를 제거한다.
4. reverse 값이 홀수일 경우 거꾸로 수행해야 하므로 가장 뒷 요소를 제거한다.
5. 값이 'D'이고 list에 값이 존재하지 않는다면 flag를 1로 갱신하고 "error"를 출력한 후 break 한다.
6. p의 모든 값을 확인한 후 flag 값이 0이고 reverse가 짝수라면 문제에서 요구하는 출력 형식에 맞추어 값을 그대로 출력한다.
7. reverse가 홀수라면 문제에서 요구하는 출력 형식에 맞추어 값을 거꾸로 하여 출력한다.

*/
