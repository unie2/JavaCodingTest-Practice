import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b)
      System.out.println(1);
    else 
      System.out.println(0);
  }
}

// 1. 정수 2개(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력한다.
