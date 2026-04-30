class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numset = set(nums)
        lcs = 0

        for num in nums:
            if num - 1 not in numset:
                current_sum = 0
                while current_sum + num in numset:
                    current_sum += 1
                    lcs = max(lcs, current_sum)
        return lcs