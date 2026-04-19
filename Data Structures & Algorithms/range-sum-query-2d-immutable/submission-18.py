class NumMatrix:

    def __init__(self, matrix: List[List[int]]):
        ROWS, COLS = len(matrix), len(matrix[0])
        self.prefixSum = [[0]* COLS for _ in range(ROWS)]

        for row in range(ROWS):
            self.prefixSum[row][0] = matrix[row][0]
            for col in range(1, COLS):
                self.prefixSum[row][col] = self.prefixSum[row][col-1] + matrix[row][col]


    def sumRegion(self, row1: int, col1: int, row2: int, col2: int) -> int:
        result = 0
        for row in range(row1, row2 + 1):
            if col1 > 0:
                result += self.prefixSum[row][col2] - self.prefixSum[row][col1- 1]
            else:
                result += self.prefixSum[row][col2]
        return result

# Your NumMatrix object will be instantiated and called as such:
# obj = NumMatrix(matrix)
# param_1 = obj.sumRegion(row1,col1,row2,col2)