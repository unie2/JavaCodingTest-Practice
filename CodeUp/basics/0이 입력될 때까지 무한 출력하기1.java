import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int value = sc.nextInt();
      
      if (value == 0)
        break;
      
      System.out.println(value);
    }
  }
}

/*
1. while문을 통해 입력된 정수 값이 0일때까지 반복 작업한다.
2. 반복문 내부에서는 0 이 아닌 수를 하나씩 출력하고, 0이 등장하면 종료한다.

*/
