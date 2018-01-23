import java.util.Arrays;

class Solution {

	public static void main(String[] args) {

		int[] A = new int[4];
		A[0] = 4;
		A[1] = 1;
		A[2] = 3;
		A[3] = 2;

		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1)
				return 1;
		}

		return 0;

	}
}
