import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = sc.next();
    int data[] = new int[value.length()];

    for (int i=0; i<value.length(); i++)
      // char - '0'을 이용하면 아스키코드 값을 알 필요없이 int형으로 변환이 가능하다. 
      data[i] = value.charAt(i) - '0';
  
    int number = 10000;

    for (int i=0; i<5; i++) {
      System.out.println("[" + data[i] * number + "]");
      number /= 10;
    }
  }
}

/*
1. 다섯 자리의 숫자를 문자열 형태로 먼저 입력받은 후, 반복문을 통해 data 배열에 각 숫자를 정수형으로 저장한다.

2. 반복문을 통해 data 배열의 요소를 하나씩 꺼내와 number와 곱해 출력한다.

3. 출력을 완료하면 number 값을 10으로 나눈 몫으로 갱신한다.

*/
