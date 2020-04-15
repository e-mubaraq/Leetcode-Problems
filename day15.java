class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        int i, prod;
        
        prod = 1;
         for (i = 0; i < len; i++) {
             output[i] = prod;
             prod = prod * nums[i];
         }
        
        prod = 1;
        for(i = len - 1; i >= 0; i--) {
             output[i] = output[i] * prod;
             prod = prod * nums[i];
        }
        
        return output;
    }
}
