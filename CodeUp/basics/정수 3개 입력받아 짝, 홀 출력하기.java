import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a % 2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");

    if (b % 2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");

    if (c % 2 == 0)
      System.out.println("even");
    else
      System.out.println("odd");
  }
}

// 1. 세 정수 a, b, c를 입력받아 각각의 수가 짝수라면 'even'을, 홀수라면 'odd'를 출력한다.
