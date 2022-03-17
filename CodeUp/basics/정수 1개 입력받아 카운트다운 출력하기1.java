import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int value = sc.nextInt();
    for(int i=value; i>0; i--)
      System.out.println(i);
  }
}

/*
1. 정수 1개를 입력받아 반복문을 통해 카운트다운을 출력한다.
2. 반복문의 범위는 입력받은 value값에서 0까지 하나씩 감소할 수 있도록 설정한다.

*/
