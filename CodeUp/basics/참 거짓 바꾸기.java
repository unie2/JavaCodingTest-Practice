import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    if (value == 0)
      System.out.println(1);
    else 
      System.out.println(0);
  }
}


// 1. 정수 값을 하나 입력받아 그 값이 0이라면 1을 출력하고, 1이라면 0을 출력한다.
