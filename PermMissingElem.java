class Solution {
    public int solution(int[] A) {
        
        int sumValue = 0;
        int sumIndex = 0;
        for(int i = 0 ; i < A.length; i++){
            sumValue += A[i];
            sumIndex += (i+1);
        }
        sumIndex += A.length + 1;
        
        return sumIndex - sumValue;
    }
}
