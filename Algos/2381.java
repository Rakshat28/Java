
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int shift[] = new int[n+1];
        for(int shiftOperations[] : shifts){
            int start = shiftOperations[0];
            int end = shiftOperations[1];
            int direction = shiftOperations[2];
            shift[start] += (direction==1 ?1:-1);
            if(end+1<n){
                shift[end+1] += (direction==1?-1:1);
            }
        }
        int lineSweepSum = 0;
        for(int i=0;i<n;i++){
            lineSweepSum+=shift[i];
            shift[i]=lineSweepSum;
        }
        StringBuilder result = new StringBuilder(s);
        for(int i=0;i<n;i++){
            int netShift = (shift[i]%26 +26)%26 ;
            result.setCharAt(i,(char)('a' + (s.charAt(i)-'a' + netShift)%26));
        }
         return result.toString();
    }
}