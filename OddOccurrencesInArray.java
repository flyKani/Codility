import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int result = 0;
        Arrays.sort(A);
        
        for(int i = 0 ; i < A.length; i++){
           if(i % 2 == 0){
               result += A[i];
           }else{
               result -= A[i];
           }
           
           if(i % 2 == 0 && result != 0){
               Math.abs(result);
           }
        }
        return Math.abs(result);
    }
}