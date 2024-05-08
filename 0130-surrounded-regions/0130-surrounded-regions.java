class Solution {
    public void solve(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;
        
         //For first row & last row
        for(int j=0; j<col; j++){
            if(board[0][j]=='O')
            dfs(board, 0, j);
            
            if(board[row-1][j]=='O')
            dfs(board, row-1, j);
        }
        
        //For first column & last column
        for(int j=0; j<row; j++){
            if(board[j][0]=='O')
            dfs(board, j, 0);
            
            if(board[j][col-1]=='O')
            dfs(board, j, col-1);
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]=='#'){
                    board[i][j] = 'O';
                }
               else if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
        
        
    }
    
    void dfs(char grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||  grid[i][j]=='X' || grid[i][j]=='#')
            return;
        
        grid[i][j] = '#';
        
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
    }
}

/*class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        // For first row & last row
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);

            if (board[row - 1][j] == 'O')
                dfs(board, row - 1, j);
        }

        // For first column & last column
        for (int j = 0; j < row; j++) {
            if (board[j][0] == 'O')
                dfs(board, j, 0);

            if (board[j][col - 1] == 'O')
                dfs(board, j, col - 1);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    void dfs(char grid[][], int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 'X' || grid[i][j] == '#')
            return;

        grid[i][j] = '#';

        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
    }
}*/
