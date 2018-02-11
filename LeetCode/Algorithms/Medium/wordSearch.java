class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index){
        if(index == word.length()){
            return true;
        }
        if(i > board.length - 1 || i < 0 || j < 0 || j > board[0].length - 1 || board[i][j] != word.charAt(index)){
            return false;
        }
        board[i][j] = '*'; // visited or here could xor with 256
        boolean result = dfs(board, i - 1, j, word, index + 1) ||
                         dfs(board, i, j - 1, word, index + 1) ||
                         dfs(board, i + 1, j, word, index + 1) ||
                         dfs(board, i, j + 1, word, index + 1);
        board[i][j] = word.charAt(index); // return the board as it is; and here xor again with 256 to return again
        return result;
    }
}
