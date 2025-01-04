package Hashing;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int key = target - nums[i]; 
            if(map.containsKey(key) && i!=map.get(key)){
                return new int[]{i,map.get(key)};
            }
        }
        return new int[]{-1,-1};
    }
}