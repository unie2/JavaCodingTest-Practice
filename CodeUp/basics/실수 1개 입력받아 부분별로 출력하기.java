import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] value = sc.next().split("[.]");
    int a = Integer.parseInt(value[0]);
    int b = Integer.parseInt(value[1]);

    System.out.printf("%d\n%d", a, b);
  }
}


/*
1. '.(닷)'을 기준으로 입력받은 문자열을 나눠 value 배열에 할당한다.
2. 변수 a에는 정수 부분을 할당하고, 변수 b에는 실수 부분을 할당하여 문제에서 요구하는 형식에 맞추어 값을 출력한다.

*/
