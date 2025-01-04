class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            sum+=nums[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }

        return max;
    }
}

// this is kadane's algorithm
