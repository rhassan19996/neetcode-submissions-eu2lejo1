class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        result = 0
        numset = set(nums)

        for num in numset:
            if num-1 not in numset:
                current_num = 0
                while current_num + num in numset:
                    current_num += 1
                    result = max(result, current_num)
        return result
