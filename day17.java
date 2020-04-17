/** 
  Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
  An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
  You may assume all four edges of the grid are all surrounded by water.
**/
  

class Solution {
    public int numIslands(char[][] grid) {
        int col, row = grid.length;
        int i, j, count = 0;
        
        if (row == 0)
            return 0;
        col = grid[0].length;
        
        for (i = 0; i < row; i++) {
            for(j = 0; j < col; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    merge(grid, i, j);
                }
            }
        }
        return count;   
    }
    
    public void merge(char[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;
        
        if (i < 0 || i >= row)
            return;
        else if (j < 0 || j >= col)
            return;
        else if (grid[i][j] != '1')
            return;
        
        grid[i][j] = '*';
        
        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);        
    }
}
