int n, m;
boolean[][] copy;
int[][] minesweeper(boolean[][] matrix) {
    copy = matrix;
    n = matrix.length;
    m = matrix[0].length;
    int[][] ans = new int[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            ans[i][j] = minesCount(i, j);
        }
    }
    return ans;
}

int minesCount(int y, int x){
    int mines = 0;
    mines += mineAt(y - 1, x - 1);  // NW
    mines += mineAt(y - 1, x);      // N
    mines += mineAt(y - 1, x + 1);  // NE
    mines += mineAt(y, x - 1);      // W
    mines += mineAt(y, x + 1);      // E
    mines += mineAt(y + 1, x - 1);  // SW
    mines += mineAt(y + 1, x);      // S
    mines += mineAt(y + 1, x + 1);
    return mines;
}

int mineAt(int y, int x){
    if(y >= 0 && y < n && x >= 0 && x < m && copy[y][x]){
        return 1;
    }else {
        return 0;
    }
}
