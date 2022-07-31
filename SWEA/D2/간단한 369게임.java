import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			String number = Integer.toString(i);
			String result = "";
			for (int j=0; j<number.length(); j++) {
				if (number.charAt(j) == '3' || number.charAt(j) == '6' || number.charAt(j) == '9') {
					result += "-";
				} 
			}
			if (result.length() >= 1) {
				System.out.print(result + " ");
			} else {
				System.out.print(number + " ");
			}
		}
	}
}

/*
1. 1부터 n까지의 수를 확인하여 각각 문자열로 변환하여 number에 담는다.
2. number의 자릿수를 하나씩 확인하는데, 만약 그 값이 '3' 이거나 '6' 이거나 '9' 일 경우 result에 "-"를 추가한다.
3. number에 대한 "-" 추가 작업을 마치면 result 문자열의 길이를 확인하고, 그 값이 1 이상일 경우 result를, 1 미만일 경우 number를 출력한다.

*/
