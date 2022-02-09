import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = sc.next();
    String data[] = value.split("");

    for (int i=0; i<data.length; i++) 
      System.out.println("'" + data[i] + "'");
  }
}


/*
1. 단어를 1개 입력받아 한 알파벳씩 나눠 배열 형태로 구성한다.

2. data 배열 길이만큼 반복작업하여 각 문자를 작은 따옴표(' ')로 묶어서 출력한다.
*/
