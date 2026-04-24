class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [0] * 9
        cols = [0] * 9
        squares = [0] * 9

        for r in range(9):
            for c in range(9):
                value = board[r][c]
                if value == ".":
                    continue
                num = int(value) - 1
                square = (r//3) * 3 + (c // 3)
                mask = 1 << num
                if (rows[r] & mask) or (cols[c] & mask) or (squares[square] & mask):
                    return False
                rows[r] |= mask
                cols[c] |= mask
                squares[square] |= mask
        return True
        