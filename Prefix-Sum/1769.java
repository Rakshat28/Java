package Prefix-Sum;

class Solution {
    public int[] minOperations(String boxes) {
        int n= boxes.length();
        int prefix[] = new int[n];
        int balls = boxes.charAt(0) == '1' ? 1 : 0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1] + balls;
            if(boxes.charAt(i) == '1'){
                balls+=1;
            }
        }
        int suffix[] = new int[n];
        balls = boxes.charAt(n-1) == '1' ? 1 : 0;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] + balls;
            if(boxes.charAt(i) == '1'){
                balls+=1;
            }
        }
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i] = prefix[i]+suffix[i];
        }
        return result;
    }
}
