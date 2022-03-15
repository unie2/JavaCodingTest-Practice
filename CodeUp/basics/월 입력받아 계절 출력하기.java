import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int month = sc.nextInt();

    switch(month) {
      case 12 :
      case 1 :
      case 2 :
        System.out.println("winter");
        break;
      case 3 :
      case 4 :
      case 5 :
        System.out.println("spring");
        break;
      case 6 :
      case 7 :
      case 8 :
        System.out.println("summer");
        break;
      case 9 :
      case 10 :
      case 11 :
        System.out.println("fall");
        break;
    }
  }
}

// 1. 정수형으로 월(month)을 입력받아 문제에서 제시한 정보를 바탕으로 계절을 출력한다.
