class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen_indices = {}

        for index, num in enumerate(nums):
            needed_value = target - num
            if needed_value in seen_indices:
                return[seen_indices[needed_value], index]
            seen_indices[num] = index
        return []