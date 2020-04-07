class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hset = new HashSet<Integer>();
        int i, count = 0;
        Integer x;
        
        Arrays.sort(arr);
        for (int a : arr) {
            x = Integer.valueOf(a);
            hset.add(x);
        }
        
        for (i = 0; i < arr.length; i++) {
            x = Integer.valueOf(arr[i]);
            
            if (hset.contains(x + 1))
                count++;
            
        }
        
        return count;
    }
}
