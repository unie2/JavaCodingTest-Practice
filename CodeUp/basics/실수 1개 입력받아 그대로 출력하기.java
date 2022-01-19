import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float value = sc.nextFloat();
    System.out.println(String.format("%.6f", value));
  }
}


/*
1. 실수 1개를 입력받아 그대로 출력한다.

2. 입력된 값이 1.150000 와 같을 경우 1.15만 출력되므로 String.format()을 통해 소수점 6자리까지 출력될 수 있도록 한다.
*/
