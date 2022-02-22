import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long first = sc.nextLong();
    long second = sc.nextLong();

    System.out.println(first + second);
  }
}

/*
1. 정수 2개를 입력받아 두 수의 합을 출력한다.

2. 단, 문제에서 제시한 바와 같이 입력되는 정수는 -1073741824 ~ 1073741824 이므로 long형으로 데이터를 입력받는다.

*/
