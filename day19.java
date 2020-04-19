/**
  Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
  (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
  You are given a target value to search. If found in the array return its index, otherwise return -1.
  You may assume no duplicate exists in the array.
  Your algorithm's runtime complexity must be in the order of O(log n).
**/

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        return binarySearch(nums, 0, len - 1, target); 
    }
    
    public int binarySearch(int [] nums, int left, int right, int target) {  
        if (left > right)
            return (-1);
        
        int mid = (left + right) / 2;
        
        if (target == nums[mid])
            return mid;
        
        if (nums[mid] >= nums[left]) {
            if (target >= nums[left] && target < nums[mid])
                return binarySearch(nums, left, mid - 1, target);
            else
                return binarySearch(nums, mid + 1, right, target);
        }
        else {
            if (target <= nums[right] && target > nums[mid])
                return binarySearch(nums, mid + 1, right, target);
            else
                return binarySearch(nums, left, mid - 1, target);
        }    
    }
}
