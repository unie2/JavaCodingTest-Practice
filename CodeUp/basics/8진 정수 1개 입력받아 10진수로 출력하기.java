import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = sc.nextLine();
    int data = Integer.parseInt(value, 8);

    System.out.println(data);
  }
}


// 1. 8진수로 변환할 데이터를 문자열 형태로 입력받은 후, parseInt( )를 통해 8진수로 변환하여 10진수로 출력한다.
