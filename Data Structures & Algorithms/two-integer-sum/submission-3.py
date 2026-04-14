class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        newmap = {}
        for index, num in enumerate(nums):
            compliment = target - num
            if compliment in newmap:
                return [newmap[compliment], index]
            newmap[num] = index
        return []