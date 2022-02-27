import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a << b);
  }
}


// 1. 정수 2개(a, b)를 입력받아 비트시프트연산자를 이용해 a를 2의 b제곱 배 곱한 값으로 출력한다.
