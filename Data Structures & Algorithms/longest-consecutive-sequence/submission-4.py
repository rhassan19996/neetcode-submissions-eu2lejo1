class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numset = set(nums)

        lcs = 0

        for num in numset:
            if num - 1 not in numset:
                current_num = 0
                while current_num + num in numset:
                    current_num += 1
                    lcs = max(lcs, current_num)
        return lcs