import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double data = sc.nextDouble();

    System.out.println(String.format("%.11f", data));
  }
}


/*
1. double형으로 소수점 아래 숫자가 11개 이하인 실수 1개를 입력받아 소수점 이하 11자리까지 출력한다.

*/
