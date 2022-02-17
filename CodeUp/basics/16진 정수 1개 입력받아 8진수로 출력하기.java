import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = sc.nextLine();
    int data = Integer.parseInt(value, 16);

    System.out.println(Integer.toOctalString(data));
  }
}


/*
1. 16진수로 변환할 데이터를 문자열 형태로 입력받은 후, parseInt( )를 통해 16진수로 변환한다.

2. 출력 시 toOctalString( )을 통해 값을 8진수로 변환하여 출력한다.

*/
