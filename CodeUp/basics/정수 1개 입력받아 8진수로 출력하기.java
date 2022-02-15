import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    System.out.println(String.format("%o", value));
  }
}


/*
1. 10진수 값을 입력받아 8진수로 출력한다.

*/
