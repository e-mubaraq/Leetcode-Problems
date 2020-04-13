class Solution {
    public int findMaxLength(int[] nums) {
        int i, count = 0, result = 0;
        HashMap <Integer, Integer> sum = new HashMap<>();
        
        sum.put(0, -1);
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count--;
            else
                count++;
            
            if (sum.containsKey(count))
                result = Math.max(result, i - sum.get(count));
            else
                sum.put(count, i);
        }      
          
        return result;
    }
}
