import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = sc.next();
    value = value.replaceAll("-", "");

    System.out.println(value);
  }
}


/*
1. replaceAll( )을 통해 "-" 문자열을 ""로 치환하여 출력한다.

*/
