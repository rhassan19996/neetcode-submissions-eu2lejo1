class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][] rows = new boolean[9][9];
        boolean [][] cols = new boolean[9][9];
        boolean [][] squares = new boolean[9][9];

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char ch = board[r][c];
                if (ch == '.'){
                    continue;
                }

                int num = Character.getNumericValue(ch) - 1;
                int square = (r /3) * 3 + (c / 3);
                if(rows[r][num] || cols[c][num] || squares[square][num]){
                    return false;
                }
                rows[r][num]= true;
                cols[c][num] = true;
                squares[square][num] = true;
            }
        }
        return true;
    }
}
