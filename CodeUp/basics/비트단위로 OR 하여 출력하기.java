import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();

    System.out.println(first | second);
  }
}

// 1. 입력된 정수 두 개를 비트단위 OR로 연산한 후 그 결과를 정수로 출력한다.
