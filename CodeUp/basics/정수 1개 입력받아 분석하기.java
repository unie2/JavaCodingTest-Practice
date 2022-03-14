import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();

    if (value < 0) {
      System.out.println("minus");
      if (value % 2 == 0)
        System.out.println("even");
      else 
        System.out.println("odd");
    } else {
      System.out.println("plus");
      if (value % 2 == 0)
        System.out.println("even");
      else
        System.out.println("odd");
    }
  }
}

// 1. 정수 1개를 입력받아 조건문을 통해 음(minus)/양(plus)과 짝(even)/홀(odd) 을 판별하여 출력한다.
