class Solution {
    public int[] vowelStrings(String[] words, int[][] queries){
        int n = words.length;
        int sum=0;
        int prefixSum[]=new int[n];
        int length = queries.length;
        int ans[]= new int[length];
        for(int i=0;i<n;i++){
            String word = words[i];
            int wordLength = word.length();
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(wordLength -1);
            if(vowelCheck(firstChar)&&vowelCheck(lastChar)){
                sum++;
            }
            prefixSum[i] = sum;
        }
        for(int i=0;i<length;i++){
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0) {
                ans[i] = prefixSum[end];
            } else {
                ans[i] = prefixSum[end] - prefixSum[start - 1];
            }
        }

        return ans;
    }
    public boolean vowelCheck(char ch){
         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}