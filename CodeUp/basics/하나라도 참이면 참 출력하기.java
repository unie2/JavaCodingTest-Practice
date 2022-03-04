import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();

    if (first == 1 || second == 1) 
      System.out.println(1);
    else 
      System.out.println(0);
  }
}

// 1. 두 정수값을 입력받아 하나라도 1일 경우 1을 출력하고, 그렇지 않으면 0을 출력한다.
