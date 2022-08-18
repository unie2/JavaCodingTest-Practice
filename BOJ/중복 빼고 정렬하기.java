import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		
		for (int i=0; i<n; i++) {
			set.add(sc.nextInt());
		}

		List<Integer> data = new ArrayList<>(set);
		
		data = merge_sort(data);
		
		for (int i=0; i<data.size(); i++)
			System.out.print(data.get(i) + " ");
	}
	
	static List merge_sort(List<Integer> data) {
		if (data.size() <= 1)
			return data;
		
		int mid = data.size() / 2;
		List<Integer> left = merge_sort(data.subList(0, mid));
		List<Integer> right = merge_sort(data.subList(mid, data.size()));
		
		int i = 0, j = 0;
		List<Integer> temp = new ArrayList<>();
		
		while (i < left.size() && j < right.size()) {
			if (left.get(i) < right.get(j)) {
				temp.add(left.get(i));
				i ++;
			} else {
				temp.add(right.get(j));
				j ++;
			}
		}
		
		temp.addAll(left.subList(i, left.size()));
		temp.addAll(right.subList(j, right.size()));
		
		return temp;
	}
}

/*
1. 일반적으로 간단한 정렬 방식으로 풀이를 진행해도 PASS를 받을 수 있지만, 병합 정렬을 사용해보고 싶어서 사용했다.

2. HashSet을 통해 중복이 제거된 값으로 이루어지도록 하고, 이를 ArrayList에 담은 후 merge_sort() 함수를 수행한다.

3. merge_sort() 함수 작업은 아래와 같다.
  - 만약 전달받은 data 리스트의 길이가 1 이하일 경우 정렬할 필요가 없으므로 단순히 data 리스트를 반환한다.
  - data 리스트 길이의 중간 값을 구하여 mid에 할당하고, 각각 중간 값을 기준으로 왼쪽 값들, 오른쪽 값들을 merge_sort()의 매개변수로 하여 재귀호출을 수행하여 반환받는다.
  - temp 리스트를 선언하여 left[i]와 right[j]를 비교하여 더 작은 값을 temp 리스트에 추가한다.
  - while문이 종료되면 left리스트와 right리스트에 남은 값들을 temp 리스트에 추가한다.
  - 최종적으로 temp 리스트를 반환한다.

*/
