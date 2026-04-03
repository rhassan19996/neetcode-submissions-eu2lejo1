class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[]rows = new HashSet[9];
        Set<Character> []cols =  new HashSet[9];
        Set<Character> []squares =new HashSet[9];


        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c =='.'){
                    continue;
                }
                int squaresIdx = (i / 3) * 3 + (j /3);
                if(rows[i].contains(c) || cols[j].contains(c) || squares[squaresIdx].contains(c)){
                    return false;
                }
                rows[i].add(c);
                cols[j].add(c);
                squares[squaresIdx].add(c);
            }
        }
        return true;
    }
}
