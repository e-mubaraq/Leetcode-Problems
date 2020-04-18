class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
         
        int m = grid.length;
        int n = grid[0].length;
         
        int[] temp = new int[n];
        temp[0] = grid[0][0];
         
        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] + grid[0][i];
        }
         
        for (int i = 1; i < m; i++) {
            temp[0] = temp[0] + grid[i][0];
            for (int j = 1; j < n; j++) {
                temp[j] = Math.min(temp[j], temp[j - 1]) + grid[i][j];
            }
        }
         
        return temp[n - 1];
    }
}
