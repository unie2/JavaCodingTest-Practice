import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = sc.next();
    String data[] = value.split("[.]");

    int year = Integer.parseInt(data[0]);
    int month = Integer.parseInt(data[1]);
    int day = Integer.parseInt(data[2]);

    System.out.println(String.format("%04d.%02d.%02d", year, month, day));
  }
}


/*
1. '.(닷)'으로 구분된 년, 월, 일을 입력받아 지정된 형식으로 출력한다.
2. split( )을 이용해 .(닷)을 기준으로 문자열을 잘라 data 배열에 저장한다.

*/
