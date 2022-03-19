import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();
    while(value != 0) {
      value -= 1;
      System.out.println(value);
    }
  }
}

/*
1. 정수 1개를 입력받아 while문을 통해 value값을 하나씩 감소시켜 값을 출력한다.
2. value의 값이 0일 경우 반복문을 종료한다.

*/

