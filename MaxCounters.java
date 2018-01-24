class Solution {

	public static void main(String[] args) {

		int[] A = {3, 4, 4, 6, 1, 4, 4};

		System.out.println(solution(5, A));
	}

	public static int[] solution(int N, int[] A) {

		int[] result = new int[N];
		int maxCounterNumber = N + 1;
		int max = 0;
		int curMax = 0;

		for (int a : A) {
			if (maxCounterNumber == a) {
				curMax = max;
			} else {
				if (curMax > result[a - 1]) {
					result[a - 1] = curMax + 1;
				} else {
					result[a - 1]++;
				}

				if (max < result[a - 1]) {
					max = result[a - 1];
				}
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] < curMax) {
				result[i] = curMax;
			}
		}

		for (int r : result) {
			System.out.println(r);
		}
		
		return result;
	}
}
