import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			count ++;
			
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}

/*
1. 입력받은 문자열의 길이만큼 반복문을 수행하고, 해당 문자를 하나씩 출력한다.
2. 출력한 후에는 count 값을 1씩 증가시켜 그 값이 10이 되면 줄바꿈을 수행하고 count 값을 0으로 다시 초기화한다.

*/
