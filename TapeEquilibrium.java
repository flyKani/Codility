class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int totalUp = 0;
        int totalDown = 0;
        int min = 99999;
        
        for(int i = 0; i < A.length; i++){
            totalUp += A[i];
        }
        
        for(int i = 1, value = 0; i < A.length; i++){
            totalUp -= A[i-1];
            totalDown += A[i-1];
            
            value = Math.abs(totalUp -  totalDown);
            
            if(min > value){
                min = value;
            }
        }
        
        return min;
    }
}
