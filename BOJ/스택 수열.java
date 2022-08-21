import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		List<Integer> stack = new ArrayList<>();
		List<Character> result = new ArrayList<>();
		boolean flag = true;
		
		for (int i=0; i<n; i++) {
			int data = sc.nextInt();
			while (count < data) {
				count ++;
				stack.add(count);
				result.add('+');
			}
			
			if (stack.get(stack.size()-1) == data) {
				stack.remove(stack.size()-1);
				result.add('-');
			} else {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			for (int i=0; i<result.size(); i++) {
				System.out.println(result.get(i));
			}
		} else
			System.out.println("NO");
	}
}

/*
1. n개의 수를 입력받는데, 현재의 count 값이 입력받은 값(data) 이상이 될 때까지 아래와 같은 작업의 while문을 수행한다.
  - count를 1 증가시킨다.
  - stack 리스트에 count 값을 추가하고, result에 '+' 를 추가한다.

2. 만약 stack리스트의 가장 마지막 요소와 data가 같을 경우 stack의 마지막 요소를 빼내고 result 리스트에 '-'를 추가한다.

3. 그렇지 않을 경우 flag를 false로 갱신하고 break 한다.

4. 최종적으로 flag값을 확인하여 그 값이 false라면 "NO"를 출력하고, true라면 한 줄에 한 개씩 result 리스트의 요소를 출력한다.

*/
