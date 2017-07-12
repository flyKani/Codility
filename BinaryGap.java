class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String strBinary = Integer.toBinaryString(N);
        int binaryGap = getBinaryGap(strBinary);
        
        return binaryGap;
    }
    
    public int getBinaryGap(String strBinary){
        int max = 0, count = 0;
        
        for(int i = 0, length = strBinary.length();i < length ;i++){
            char ch = strBinary.charAt(i);
            
            if(ch == '0'){
                count++;
            }else{
                if(max < count){
                    max = count;
                }
                count = 0;
            }
            
        }
        
        return max;
        
    }
}