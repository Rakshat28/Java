class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0, max =0;
        for(int end =0;end<nums.length;end++){
            if(nums[end] == 0){
                max = Math.max(max,end - start);
                start = end + 1;
            }
        }
        return Math.max(max,nums.length - start);
    }
}