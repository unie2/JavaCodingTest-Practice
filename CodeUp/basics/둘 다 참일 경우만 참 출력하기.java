import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();

    if (first == 1 && second == 1) 
      System.out.println(1);
    else
      System.out.println(0);
  }
}

// 1. 정수 값 두 개를 입력받아 두 값 모두 1일 경우 1을 출력하고, 그렇지 않을 경우 0을 출력한다.
