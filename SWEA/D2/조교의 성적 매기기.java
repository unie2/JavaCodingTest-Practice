import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		String[] scores = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		
		for (int tc=1; tc<=t; tc++) {
			int n = sc.nextInt(); // 학생 수
			int k = sc.nextInt(); // 학점을 알고싶은 학생의 번호
			
			ArrayList<Double> arr = new ArrayList<>();
			for (int i=0; i<n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				double sum_value = (a * 0.35) + (b * 0.45) + (c * 0.2);
				arr.add(sum_value);
			}
			
			double k_score = arr.get(k-1);
			Collections.sort(arr, Collections.reverseOrder());
			
			int value = (int)(n/10);
			int result = (int)(arr.indexOf(k_score) / value);
			
			System.out.println("#" + tc + " " + scores[result]);
		}
	}
}

/*
1. 각 점수에 대한 등급을 구성한 scores 배열을 정의한다.
2. 각 테스트 케이스마다 n과 k를 입력받고 총점을 담기 위한 arr 배열을 초기화한다.
3. 각 학생에 대한 세 가지 점수를 입력받아 문제에서 제시한 비율로 계산하여 세 점수를 합한 값을 arr 배열에 추가한다.
4. 구하고자 하는 학생의 점수를 k_score에 할당하고, arr 배열을 내림차순으로 정렬한다.
5. n / 10 명의 학생들에게 동일한 평점을 부여할 수 있으므로, n / 10을 계산하고 정수형으로 변환하여  value에 할당한다.
6. 해당 점수(k_score)에 해당되는 인덱스를 찾아 value로 나눠 result에 할당하고, 최종적으로 해당 테스트 케이스 번호와 함께 등급(scores[result])을 출력한다.

*/
