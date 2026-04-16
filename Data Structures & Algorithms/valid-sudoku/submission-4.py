class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [0] * 9
        cols = [0] * 9
        boxes = [0] * 9

        for r in range(9):
            for c in range(9):
                val = board[r][c]
                if val == ".":
                    continue
                box = (r // 3) * 3 + (c // 3)
                num = int(val) - 1
                mask = 1 << num
                if (rows[r] & mask) or (cols[c] & mask) or (boxes[box] & mask):
                    return False
                rows[r] |= mask
                cols[c] |= mask
                boxes[box] |= mask
        return True