/**
  Given an array of integers and an integer k, 
  you need to find the total number of continuous subarrays whose sum equals to k.
**/
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int i, count = 0;
        int sum = 0;
        int len = nums.length;
        
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (i = 0; i < len; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
