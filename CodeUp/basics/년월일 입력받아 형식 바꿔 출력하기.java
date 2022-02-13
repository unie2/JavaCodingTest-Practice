import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value[] = sc.next().split("[.]");

    System.out.println(value[2] + '-' + value[1] + '-' + value[0]);
  }
}


/*
1. 년월일 형식의 입력값을 닷('.')을 기준으로 나눠 value 배열에 저장한다.

2. '일-월-년' 형식으로 값을 출력한다.

*/
