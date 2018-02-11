class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    ans++;
                    dfs(grid, rows, cols, i, j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int rows, int cols, int r, int c){

        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        dfs(grid, rows, cols, r - 1, c);
        dfs(grid, rows, cols, r + 1, c);
        dfs(grid, rows, cols, r, c + 1);
        dfs(grid, rows, cols, r, c - 1);
    }
}
