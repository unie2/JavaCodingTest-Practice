import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
  }
}

// 1. 삼항 연산자를 이용하여 입력받은 a, b, c 중 가장 작은 값을 출력한다.
