package Algos;

class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int element = nums[0];
       for(int i=0;i<nums.length;i++){
        if(count == 0){
            element = nums[i];
        }
        if(nums[i] == element){
            count++;
        }else{
            count--;
        }
       }
       return element;
    }
}


// this is called the Moore's Voting algorithm 

// class Solution {
//     public int majorityElement(int[] nums) {
//         // Step 1: Find the candidate
//         int candidate = nums[0], count = 0;
//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num;
//             }
//             count += (num == candidate) ? 1 : -1;
//         }

//         // Step 2: Verify the candidate
//         count = 0;
//         for (int num : nums) {
//             if (num == candidate) {
//                 count++;
//             }
//         }

//         return count > nums.length / 2 ? candidate : -1;
//     }
// }
