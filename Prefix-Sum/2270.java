
class Solution {
    public int waysToSplitArray(int[] nums) {
        int length = nums.length;
        long totalSum = 0;
        for(int i=0;i<length;i++){
            totalSum+=nums[i];
        }
        long prefixSum = 0;
        int counter = 0;
        for(int i=0;i< length-1;i++){
            prefixSum+=nums[i];
            if(prefixSum >= (totalSum-prefixSum)){
                counter++;
            }
        }
        return counter;
    }
}