// https://www.acmicpc.net/problem/3085

import java.util.*;
import java.io.*;

public class Main {
	static int result = 0;
	static int n;
	static char[][] data;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		data = new char[n][n];
		for (int i=0; i<n; i++) {
			String st = br.readLine();
			for (int j=0; j<n; j++) {
				data[i][j] = st.charAt(j);
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-1; j++) {
				// 두 원소가 다르다면 (가로 기준)
				if (data[i][j] != data[i][j+1]) {
					// swap
					char temp = data[i][j];
					data[i][j] = data[i][j+1];
					data[i][j+1] = temp;
					check_col(); // 가로 확인
					check_row(); // 세로 확인
					
					temp = data[i][j];
					data[i][j] = data[i][j+1];
					data[i][j+1] = temp;
				}
				
				if (data[j][i] != data[j+1][i]) {
					char temp = data[j][i];
					data[j][i] = data[j+1][i];
					data[j+1][i] = temp;
					check_col();
					check_row();
					
					temp = data[j][i];
					data[j][i] = data[j+1][i];
					data[j+1][i] = temp;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static void check_col() {
		for (int k=0; k<n; k++) {
			int length = 1;
			for (int l=0; l<n-1; l++) {
				if (data[k][l] == data[k][l+1]) {
					length ++;
					result = Math.max(result, length);
				} else
					length = 1;
			}
		}
	}
	
	public static void check_row() {
		for (int k=0; k<n; k++) {
			int length = 1;
			for (int l=0; l<n-1; l++) {
				if (data[l][k] == data[l+1][k]) {
					length ++;
					result = Math.max(result, length);
				} else 
					length = 1;
			}
		}
	}
}


/*
1. n x n 크기의 사탕을 입력받아 2차원 data 배열에 정의한다.
 
2. 이중 for문을 돌려 가로, 세로 각 상황을 확인하여 만약 두 원소가 다르다면 두 값을 교환해주고 최대값을 구하기 위해 check_col() 함수와 check_row() 함수를 수행한다.
   이후 다른 경우의 수도 확인해봐야 하므로 교환했던 두 값을 다시 원래대로 교환한다.
 
3. check_col() 함수와 check_row() 함수는 각 가로와 세로를 기준으로 연속 부분의 최대값을 구해 result를 갱신해나간다.

*/
