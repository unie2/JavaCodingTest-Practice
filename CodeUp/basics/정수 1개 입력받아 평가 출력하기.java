import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int score = sc.nextInt();

    if (score >= 90 && score <= 100)
      System.out.println("A");
    else if (score >= 70 && score <= 89)
      System.out.println("B");
    else if (score >= 40 && score <= 69)
      System.out.println("C");
    else
      System.out.println("D");
  }
}

// 1. 점수를 입력받아 조건문을 통해 문제에서 제시한 평가 기준을 판별하여 평가를 출력한다.
