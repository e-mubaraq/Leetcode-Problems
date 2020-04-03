/**
Leetcode Day3 - Maximum Subarray Problem solved with Kadane's Algorithm
**/

class Solution {
    public int maxSubArray(int[] nums) {
        int i, j, len, sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        len = nums.length;
            
        for (i = 0; i < len; i++) {
             sum+= nums[i]; 
            
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0)
                sum = 0;

        }
        
        return maxSum;
    }
}
