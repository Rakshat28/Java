package Hashing;
import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstIndex = new HashMap<>();
        HashMap<Character,Integer> lastIndex = new HashMap<>();
        int length = s.length();
        for(int i=0;i<length;i++){
            char ch = s.charAt(i);
            if(!firstIndex.containsKey(ch)){
                firstIndex.put(ch,i);
            }
            lastIndex.put(ch,i);
        }
        int counter = 0;
        for(char ch : firstIndex.keySet()){
            int first = firstIndex.get(ch);
            int last = lastIndex.get(ch);
            if(first == last){
                continue;
            }
            HashSet<Character> set = new HashSet<>();
            for(int i=first+1;i<last;i++){
                set.add(s.charAt(i));
            }
            counter +=  set.size();
        }
        return counter;
    }
}

// good question
