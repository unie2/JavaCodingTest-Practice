import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long value = sc.nextLong();

    System.out.println(value + 1);
  }
}


// 1. 정수를 1개 입력받아 1만큼 더해 출력한다.

// 2. 단, -2147483648 ~ +2147483647 의 범위로 입력되는데, 2147483647이 입력될 경우 연산 시 범위를 초과하기 때문에 long형으로 데이터를 입력받는다.
