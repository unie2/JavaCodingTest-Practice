import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    System.out.println(Integer.toHexString(value).toUpperCase());
  }
}


// 1. 10진수 데이터를 입력받아 16진수 대문자로 출력한다.
