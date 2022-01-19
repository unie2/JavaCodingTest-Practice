import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    for(int i=0; i<3; i++) {
      System.out.printf("%d ", value);
    }
  }
}


/*
1. 정수 1개를 입력받아 반복문을 통해 값을 3번 출력한다.
*/
