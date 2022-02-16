import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    System.out.println(String.format("%x", value));
  }
}

// 1. 10진수 데이터를 입력받아 16진수로 출력한다.
