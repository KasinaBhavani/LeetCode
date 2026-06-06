class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:  
        r_sum = sum(nums)
        l_sum = 0
        ans = [0] * len(nums)
        for i in range(len(nums)):
            r_sum-= nums[i]
            ans[i] = abs(l_sum - r_sum)
            l_sum += nums[i]
        return ans