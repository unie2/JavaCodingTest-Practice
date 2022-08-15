import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> data = new LinkedList<>();
		
		String first = br.readLine();
		for (int i=0; i<first.length(); i++)
			data.add(first.charAt(i));
		
		ListIterator<Character> iter = data.listIterator();
		
		while (iter.hasNext()) {
			iter.next();
		}
		
		int m = Integer.parseInt(br.readLine());
		for (int i=0; i<m; i++) {
			String command = br.readLine();
			char state = command.charAt(0);
			
			if (state == 'L') { // 커서를 왼쪽으로 한 칸 옮김
				// 커서가 문장의 맨 앞이면 무시
				if (iter.hasPrevious())
					iter.previous();
			} else if(state == 'D') { // 커서를 오른쪽으로 한 칸 옮김
				// 커서가 문장의 맨 뒤이면 무시
				if (iter.hasNext())
					iter.next();
			} else if (state == 'B') { // 커서 왼쪽에 있는 문자 삭제
				if (iter.hasPrevious()) {
					iter.previous();
					iter.remove(); // next()나 previous()에 의해 반환된 가장 마지막 요소 제거
				}
			} else if (state == 'P') { // 문자를 커서 왼쪽에 추가
				char chr = command.charAt(2);
				iter.add(chr);
			}
		}
		
		for (Character chr : data)
			bw.append(chr);
		
		bw.flush();
		bw.close();
		br.close();
	}
}

/*
1. 데이터 입출력, 삽입, 삭제 연산을 용이하게 하기 위해 LinkedList와 ListIterator를 통해 문제를 해결한다.

2. 가장 초기의 커서(iter)는 data 리스트의 가장 마지막 위치에 존재하도록 한다.

3. m개의 명령어에 대하여 처리하는데, 명령어가 'L'일 경우 아래와 같은 작업을 수행한다.
  - 만약 커서를 왼쪽으로 더 옮길 수 있다면(iter.hasPrevious()) 왼쪽으로 옮긴다. (iter.previous())

4. 명령어가 'D'일 경우 아래와 같은 작업을 수행한다.
  - 만약 커서를 오른쪽으로 더 옮길 수 있다면 (iter.hasNext()) 오른쪽으로 옮긴다. (iter.next())

5. 명령어가 'B'일 경우 아래와 같은 작업을 수행한다.
  - 만약 커서를 왼쪽으로 더 옮길 수 있다면 커서를 왼쪽으로 옮기고 값을 삭제한다.
  - 이때 remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거한다.

6. 명령어가 'P'일 경우 아래와 같은 작업을 수행한다.
  - 추가할 문자를 command에서 가져와 iter.add(chr)를 통해 문자를 추가한다.

7. data 리스트에 존재하는 문자들을 bw에 추가한 후 flush()를 통해 출력한다.

*/
