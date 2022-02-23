import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char value = sc.nextLine().charAt(0);

    System.out.println((char)(value + 1));
  }
}

// 1. 영문자 1개를 입력받아 1을 더해준 뒤 문자형으로 변환해줌으로써 그 다음 문자를 출력할 수 있다.
