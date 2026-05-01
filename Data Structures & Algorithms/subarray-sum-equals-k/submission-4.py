class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        current_sum = 0
        freqmap = {0:1}

        for num in nums:
            current_sum += num

            previous_current_sum = current_sum - k

            count += freqmap.get(previous_current_sum, 0)

            freqmap[current_sum] = freqmap.get(current_sum, 0) + 1
        return count