import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();

    int total = first + second + third ;

    System.out.println(total);
    System.out.println(String.format("%.1f", (float)total / 3));
  }
}

/*
1. 정수 3개를 입력받아 합과 평균을 출력한다.

2. 평균 출력 시, 문제에서 입력받는 갯수가 3개로 제한되어 있으므로 단순히 3으로 나눈다.

*/
