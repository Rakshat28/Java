class Solution {
    public boolean check(int[] nums) {
        int length = nums.length;
        int count = 0;
        for(int i=0;i<length;i++){
            if(nums[(i+1)%length] < nums[i%length]){
                count++;
            }

        }
        if(count <= 1){
            return true;
        }
        return false;
    }
}