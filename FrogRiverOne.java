import java.util.HashSet;

class Solution {

	public static void main(String[] args) {

		int[] A = new int[8];

		A[0] = 1;
		A[1] = 3;
		A[2] = 1;
		A[3] = 4;
		A[4] = 2;
		A[5] = 3;
		A[6] = 5;
		A[7] = 4;


		System.out.println(solution(5, A));
	}

	public static int solution(int X, int[] A) {

		HashSet leaf = new HashSet();

		for (int i = 0; i < A.length; i++) {
			leaf.add(A[i]);

			if(leaf.size() == X){
				return i;
			}
		}

		return -1;
	}
}
