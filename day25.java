/**
  Given an array of non-negative integers, you are initially positioned at the first index of the array.
  Each element in the array represents your maximum jump length at that position.
  Determine if you are able to reach the last index.
**/

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 0)
            return false;
        if (nums.length == 1)
            return true;
        
        int i, max = nums[0];
        int len;
                
        len = nums.length;
        
        for (i = 0; i < len; i++) {
            if (max <= i && nums[i] == 0)
                return false;
            
            if (i + nums[i] > max)
                max = i + nums[i];
            
            if (max >= len - 1)
                return true;
        }
        return false;  
    }
}
