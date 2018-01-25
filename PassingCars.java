class Solution {

	public static void main(String[] args) {

		int[] A = {0, 1, 0, 1, 1};

		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		int east = 0;
		int pair = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				east++;
			else
				pair += east;

			if (pair > 1000000000)
				return -1;
		}

		return pair;


	}
}
