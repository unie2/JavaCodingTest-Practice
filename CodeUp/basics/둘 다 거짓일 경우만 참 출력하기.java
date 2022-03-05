import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();

    if (first == 0 && second == 0) 
      System.out.println(1);
    else
      System.out.println(0);
  }
}

// 1. 두 정수값을 입력받아 두 값 모두 0일 경우 1을 출력하고, 그렇지 않으면 0을 출력한다.
