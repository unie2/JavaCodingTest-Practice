import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char data = sc.nextLine().charAt(0);
    
    switch(data) {
      case 'A' :
        System.out.println("best!!!");
        break;
      case 'B' :
        System.out.println("good!!");
        break;
      case 'C' :
        System.out.println("run!");
        break;
      case 'D' :
        System.out.println("slowly~");
        break;
      default :
        System.out.println("what?");
        break;
    }
  }
}

// 1. 평가를 문자(char)로 입력받아 switch ~ case 문을 통해 문제에서 제시한 평가 내용을 바탕으로 문자열을 출력한다.
