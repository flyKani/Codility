class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        if(K < 1 || A.length < 1){
            return A;
        }
        
        
        K = K % A.length;
        int buffer;

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < A.length; j++) {
                buffer = A[0];
                A[0] = A[j];
                A[j] = buffer;
            }
        }

        return A;
    }
}