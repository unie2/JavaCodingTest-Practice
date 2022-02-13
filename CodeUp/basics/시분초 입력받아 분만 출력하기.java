import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value[] = sc.next().split(":");

    if (value[1].equals("00"))
      System.out.println("0");
    else
      System.out.println(value[1]); 
  }
}


/*
1. 시분초 형식으로 입력받아 split( )을 통해 ':' 를 기준으로 나눠 value 배열에 저장한다.

2. 만약 분에 해당하는 값이 00일 경우 0을 출력하고, 그렇지 않은 경우 value의 1번째 값을 그대로 출력한다.

*/
