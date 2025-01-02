class Solution {
    public void moveZeroes(int[] nums) {
        int firstPointer = 0;
        int secondPointer = 0;
        int length = nums.length;
        while(secondPointer < length){
            if(nums[secondPointer]!=0){
                int temp = nums[firstPointer];
                nums[firstPointer] = nums[secondPointer];
                nums[secondPointer]= temp;
                firstPointer++;
            }
            secondPointer++;
        }
    }
}