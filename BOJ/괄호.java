import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			String vps = br.readLine();
			int open = 0;
			boolean flag  = true;
			for (int j=0; j<vps.length(); j++) {
				if (vps.charAt(j) == ')') {
					open -= 1;
				} else {
					open += 1;
				}
				if (open < 0) {
					flag = false;
					break;
				}
			}
			if (flag == true && open == 0)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/*
1. 각 테스트 케이스마다 괄호 문자열을 입력받아 문자를 하나씩 확인한다.
2. 만약 현재의 문자가 ')' 일 경우 open을 1 감소시키고, '(' 일 경우 open을 1 증가시킨다.
3. open이 음수가 되면 올바른 괄호 형태가 아니므로 flag를 false로 변환한 뒤 break한다.
4. 만약 flag가 true이고 open이 0일 경우 올바른 괄호 형태이므로 "YES"를, 아니라면 "NO"를 출력한다.

*/
