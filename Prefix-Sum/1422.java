class Solution {
    public int maxScore(String s) {
        int numberOfOnes = 0;
        int numberOfZeros = 0;
        int max = Integer.MIN_VALUE;
        int length = s.length();
        for(int i=0;i<length;i++){
            if(s.charAt(i)=='1'){
                numberOfOnes++;
            }
        }
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)=='0'){
                numberOfZeros++;
            }
            if(s.charAt(i)=='1'){
                numberOfOnes--;
            }
            int sum = numberOfZeros + numberOfOnes;
            if(sum>max){
                max = sum;
            }
        }

        return max;
    }
}