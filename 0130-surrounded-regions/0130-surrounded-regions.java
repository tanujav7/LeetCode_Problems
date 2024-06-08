class Solution {
    public void solve(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;
        
        //First row and last row
        for(int j=0; j<col; j++){
            if(board[0][j]=='O')
                dfs(board, 0, j);
            
             if(board[row-1][j]=='O')
                dfs(board, row-1, j);
        }
        
         //First column and last column
        for(int j=0; j<row; j++){
            if(board[j][0]=='O')
                dfs(board, j, 0);
            
             if(board[j][col-1]=='O')
                dfs(board, j, col-1);
        }
        
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]=='#')
                    board[i][j] = 'O';
                else
                    board[i][j] = 'X';
            }
        }
    }
    
    
    void dfs(char board[][], int i, int j){
        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='X' || board[i][j]=='#')
            return;
        
         board[i][j] = '#';
        
         dfs(board, i+1, j);
         dfs(board, i-1, j);
         dfs(board, i, j+1);
         dfs(board, i, j-1);
        
    }
}