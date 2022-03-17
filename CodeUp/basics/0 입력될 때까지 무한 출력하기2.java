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

// 1. 정수 값들을 입력받아, 현재 확인하고 있는 값이 0이 아니면 출력하고, 0이라면 반복문을 종료한다.
