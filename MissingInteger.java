import java.util.HashSet;

class Solution {

	public static void main(String[] args) {

		int[] A = {1, 3, 6, 4, 1, 2}; //5

		int[] B = {1, 2, 3}; // 4

		int[] C = {-1, -3}; // 1


		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		HashSet hashSet = new HashSet();
		int result = 1;

		for (int a : A) {
			hashSet.add(a);
		}
		while (hashSet.contains(result)) {
			result++;
		}

		return result;

	}
}
