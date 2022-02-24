import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.println(String.format("%.2f", (float)a / b));
  }
}

/*
1. 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 차례대로 출력한다.

2. 나눈 값의 경우, String.format() 을 통해 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력하도록 한다.

*/
