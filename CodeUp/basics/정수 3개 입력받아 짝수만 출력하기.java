import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a % 2 == 0)
      System.out.println(a);
    if (b % 2 == 0)
      System.out.println(b);
    if (c % 2 == 0)
      System.out.println(c);
  }
}

// 1. 세 정수 a, b, c를 입력받아 조건문을 통해 짝수인 값만 출력한다.
