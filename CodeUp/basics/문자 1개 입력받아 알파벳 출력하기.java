import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char value = sc.nextLine().charAt(0);

    for(char i='a'; i<=value; i++) {
      System.out.printf("%c ", i);
    }
  }
}

// 1. 영문자 1개를 입력받아 for문을 통해 문자 'a'부터 입력받은 문자까지의 알파벳을 순서대로 출력한다.
