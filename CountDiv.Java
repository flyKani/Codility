public class Main {

	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2)); // .. 6 8 10
		System.out.println(solution(11, 345, 17)); // .. 20
	}

	public static int solution(int A, int B, int K) {
		return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
	}
}

