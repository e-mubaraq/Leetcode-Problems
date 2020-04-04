class Solution {
    public void moveZeroes(int[] nums) {
        int i, j, temp;
        
        j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }         
        }
    }
    
}
