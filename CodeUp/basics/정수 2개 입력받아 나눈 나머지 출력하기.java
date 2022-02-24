import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a % b);
  }
}

// 정수 2개(a, b)를 입력받아 a를 b로 나눈 나머지를 출력한다.
