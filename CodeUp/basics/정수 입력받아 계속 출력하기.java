import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<n; i++) 
      arr[i] = sc.nextInt();

    for(int i=0; i<n; i++)
      System.out.println(arr[i]);
  }
}

/*
1. 입력받은 n의 크기로 배열 arr[]를 정의한다.
2. 반복문을 통해 입력받은 n개의 값들을 하나씩 배열 arr[]에 할당한다.
3. 반복문을 통해 배열 arr[]에 담겨있는 요소를 하나씩 출력한다.

*/
