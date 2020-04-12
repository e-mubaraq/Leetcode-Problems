class Solution {
    public int lastStoneWeight(int[] stones) {
        int diff, result = 0;
        ArrayList<Integer> stonesList = new ArrayList<>();
        
        for (int weight : stones) {
            stonesList.add(weight);
        }
        
        Collections.sort(stonesList, Collections.reverseOrder());
        
        while (stonesList.size() > 1) {
            diff = stonesList.get(0) - stonesList.get(1);
            stonesList.remove(1);
            stonesList.remove(0);
            
            stonesList.add(diff);
            Collections.sort(stonesList, Collections.reverseOrder());
                
        }
            
            
        return stonesList.get(0);
        
    }
}
