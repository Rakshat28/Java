package Mathematics;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        int checkSum = 0;
        for(int i=0;i<n;i++){
            checkSum+=nums[i];
        }
    return sum-checkSum;
    }
}