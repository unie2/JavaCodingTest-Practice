import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    System.out.println(~value);
  }
}

// 1. 입력받은 하나의 정수를 비트단위(bitwise) 연산자 ~(tilde)를 사용하여 참/거짓을 바꾼 후 정수형으로 출력한다.
