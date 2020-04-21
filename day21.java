/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int row, col, index = -1;
        List<Integer> dimensions = new ArrayList<>();
        
        dimensions = binaryMatrix.dimensions();
        row = dimensions.get(0);
        col = dimensions.get(1);
        
        for (int i = 0, j = col - 1; i < row && j >= 0;) {
            if (binaryMatrix.get(i,j) == 1) {
                index = j;
                j--;
            } 
            else
                i++;
        }
        return index;
        
    }
    
}
