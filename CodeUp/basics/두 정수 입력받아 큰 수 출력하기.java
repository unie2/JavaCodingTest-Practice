import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a > b ? a : b);
  }
}

// 1. 3항 연산자를 사용하여 입력받은 a와 b 중 더 큰 값을 출력한다.
